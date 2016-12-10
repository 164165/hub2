/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hub.service;

/**
 *
 * @author marek
 */
import org.hub.domain.NBPArrayOfExchangeRatesTable;
import org.hub.domain.Xrate;
import org.hub.domain.NBPRate;
import org.hub.domain.ECBRates;
import org.hub.domain.XchangeRates;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XchangeRatesService {

    private XchangeRates rates = new XchangeRates();
    private static final XchangeRatesService sinstance = new XchangeRatesService();

    private XchangeRatesService() {

    }

    public static XchangeRatesService getInstance() {
        return sinstance;
    }

    public XchangeRates getRates() {
        return rates;
    }

    public void setRates(XchangeRates rates) {
        this.rates = rates;
    }

    public void setRates(ECBRates ecbRates, NBPArrayOfExchangeRatesTable nbpRates) {
        this.rates = new XchangeRates();
        ratesConvert(ecbRates, nbpRates);
    }

    public XchangeRatesService(XchangeRates rates) {
        this.rates = rates;
    }

    private void ratesConvert(ECBRates ecbRates, NBPArrayOfExchangeRatesTable nbpRates) {

        this.rates.setXDate(nbpRates.getNBPExchangeRatesTable().getEffectiveDate());
        this.rates.setNo(nbpRates.getNBPExchangeRatesTable().getNo());

        for (Iterator<NBPRate> it = nbpRates.getNBPExchangeRatesTable().getNBPRates().getNBPRate().iterator(); it.hasNext();) {
            NBPRate rate = it.next();
            double ecbRate = 0D;
            try {
                ecbRate = getECBrateByCode(ecbRates, rate.getCode());
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(XchangeRatesService.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(XchangeRatesService.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(XchangeRatesService.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (ecbRate > 0) {
                ecbRate = this.round(1 / ecbRate, 8);
                this.rates.getXrates().getXrate().add(new Xrate(rate.getCurrency(), rate.getCode(), String.format("%.8f", rate.getMid()), String.format("%.8f", ecbRate)));
            }

        }

    }

    private double getECBrateByCode(ECBRates ecbRates, String code) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        
        String methodName;

        methodName = "get" + code;
        
        Method getNameMethod = ecbRates.getClass().getMethod(methodName);
        double rate = (double) getNameMethod.invoke(ecbRates);
        return rate;
        
    }

    private static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

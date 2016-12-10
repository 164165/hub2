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

import org.hub.domain.ECBRate;

public class ECBRatesService {
    private ECBRate ecbRate;

    private static final ECBRatesService sinstance = new ECBRatesService();
    
    private ECBRatesService() {
       
    }
    
    public static ECBRatesService getInstance() {
        return sinstance;
    }
    
    public ECBRate getEcbRate() {
        return ecbRate;
    }

    public void setEcbRate(ECBRate ecbRate) {
        this.ecbRate = ecbRate;
    }

    public ECBRatesService(ECBRate ecbRate) {
        this.ecbRate = ecbRate;
    }
    
               
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hub.domain;

/**
 *
 * @author marek
 */
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "AUD",
    "BGN",
    "BRL",
    "CAD",
    "CHF",
    "CNY",
    "CZK",
    "DKK",
    "GBP",
    "HKD",
    "HRK",
    "HUF",
    "IDR",
    "ILS",
    "INR",
    "JPY",
    "KRW",
    "MXN",
    "MYR",
    "NOK",
    "NZD",
    "PHP",
    "RON",
    "RUB",
    "SEK",
    "SGD",
    "THB",
    "TRY",
    "USD",
    "ZAR",
    "EUR"
})
public class ECBRates {

    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("USD")
    private Double uSD;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonProperty("EUR")
    private Double eUR;

    /**
     *
     * @return The aUD
     */
    @JsonProperty("AUD")
    public Double getAUD() {
        return aUD;
    }

    /**
     *
     * @param aUD The AUD
     */
    @JsonProperty("AUD")
    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    /**
     *
     * @return The bGN
     */
    @JsonProperty("BGN")
    public Double getBGN() {
        return bGN;
    }

    /**
     *
     * @param bGN The BGN
     */
    @JsonProperty("BGN")
    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    /**
     *
     * @return The bRL
     */
    @JsonProperty("BRL")
    public Double getBRL() {
        return bRL;
    }

    /**
     *
     * @param bRL The BRL
     */
    @JsonProperty("BRL")
    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    /**
     *
     * @return The cAD
     */
    @JsonProperty("CAD")
    public Double getCAD() {
        return cAD;
    }

    /**
     *
     * @param cAD The CAD
     */
    @JsonProperty("CAD")
    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    /**
     *
     * @return The cHF
     */
    @JsonProperty("CHF")
    public Double getCHF() {
        return cHF;
    }

    /**
     *
     * @param cHF The CHF
     */
    @JsonProperty("CHF")
    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    /**
     *
     * @return The cNY
     */
    @JsonProperty("CNY")
    public Double getCNY() {
        return cNY;
    }

    /**
     *
     * @param cNY The CNY
     */
    @JsonProperty("CNY")
    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    /**
     *
     * @return The cZK
     */
    @JsonProperty("CZK")
    public Double getCZK() {
        return cZK;
    }

    /**
     *
     * @param cZK The CZK
     */
    @JsonProperty("CZK")
    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    /**
     *
     * @return The dKK
     */
    @JsonProperty("DKK")
    public Double getDKK() {
        return dKK;
    }

    /**
     *
     * @param dKK The DKK
     */
    @JsonProperty("DKK")
    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    /**
     *
     * @return The gBP
     */
    @JsonProperty("GBP")
    public Double getGBP() {
        return gBP;
    }

    /**
     *
     * @param gBP The GBP
     */
    @JsonProperty("GBP")
    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    /**
     *
     * @return The hKD
     */
    @JsonProperty("HKD")
    public Double getHKD() {
        return hKD;
    }

    /**
     *
     * @param hKD The HKD
     */
    @JsonProperty("HKD")
    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    /**
     *
     * @return The hRK
     */
    @JsonProperty("HRK")
    public Double getHRK() {
        return hRK;
    }

    /**
     *
     * @param hRK The HRK
     */
    @JsonProperty("HRK")
    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    /**
     *
     * @return The hUF
     */
    @JsonProperty("HUF")
    public Double getHUF() {
        return hUF;
    }

    /**
     *
     * @param hUF The HUF
     */
    @JsonProperty("HUF")
    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    /**
     *
     * @return The iDR
     */
    @JsonProperty("IDR")
    public Double getIDR() {
        return iDR;
    }

    /**
     *
     * @param iDR The IDR
     */
    @JsonProperty("IDR")
    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    /**
     *
     * @return The iLS
     */
    @JsonProperty("ILS")
    public Double getILS() {
        return iLS;
    }

    /**
     *
     * @param iLS The ILS
     */
    @JsonProperty("ILS")
    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    /**
     *
     * @return The iNR
     */
    @JsonProperty("INR")
    public Double getINR() {
        return iNR;
    }

    /**
     *
     * @param iNR The INR
     */
    @JsonProperty("INR")
    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    /**
     *
     * @return The jPY
     */
    @JsonProperty("JPY")
    public Double getJPY() {
        return jPY;
    }

    /**
     *
     * @param jPY The JPY
     */
    @JsonProperty("JPY")
    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    /**
     *
     * @return The kRW
     */
    @JsonProperty("KRW")
    public Double getKRW() {
        return kRW;
    }

    /**
     *
     * @param kRW The KRW
     */
    @JsonProperty("KRW")
    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    /**
     *
     * @return The mXN
     */
    @JsonProperty("MXN")
    public Double getMXN() {
        return mXN;
    }

    /**
     *
     * @param mXN The MXN
     */
    @JsonProperty("MXN")
    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    /**
     *
     * @return The mYR
     */
    @JsonProperty("MYR")
    public Double getMYR() {
        return mYR;
    }

    /**
     *
     * @param mYR The MYR
     */
    @JsonProperty("MYR")
    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    /**
     *
     * @return The nOK
     */
    @JsonProperty("NOK")
    public Double getNOK() {
        return nOK;
    }

    /**
     *
     * @param nOK The NOK
     */
    @JsonProperty("NOK")
    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    /**
     *
     * @return The nZD
     */
    @JsonProperty("NZD")
    public Double getNZD() {
        return nZD;
    }

    /**
     *
     * @param nZD The NZD
     */
    @JsonProperty("NZD")
    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    /**
     *
     * @return The pHP
     */
    @JsonProperty("PHP")
    public Double getPHP() {
        return pHP;
    }

    /**
     *
     * @param pHP The PHP
     */
    @JsonProperty("PHP")
    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    /**
     *
     * @return The rON
     */
    @JsonProperty("RON")
    public Double getRON() {
        return rON;
    }

    /**
     *
     * @param rON The RON
     */
    @JsonProperty("RON")
    public void setRON(Double rON) {
        this.rON = rON;
    }

    /**
     *
     * @return The rUB
     */
    @JsonProperty("RUB")
    public Double getRUB() {
        return rUB;
    }

    /**
     *
     * @param rUB The RUB
     */
    @JsonProperty("RUB")
    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    /**
     *
     * @return The sEK
     */
    @JsonProperty("SEK")
    public Double getSEK() {
        return sEK;
    }

    /**
     *
     * @param sEK The SEK
     */
    @JsonProperty("SEK")
    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    /**
     *
     * @return The sGD
     */
    @JsonProperty("SGD")
    public Double getSGD() {
        return sGD;
    }

    /**
     *
     * @param sGD The SGD
     */
    @JsonProperty("SGD")
    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    /**
     *
     * @return The tHB
     */
    @JsonProperty("THB")
    public Double getTHB() {
        return tHB;
    }

    /**
     *
     * @param tHB The THB
     */
    @JsonProperty("THB")
    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    /**
     *
     * @return The tRY
     */
    @JsonProperty("TRY")
    public Double getTRY() {
        return tRY;
    }

    /**
     *
     * @param tRY The TRY
     */
    @JsonProperty("TRY")
    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    /**
     *
     * @return The uSD
     */
    @JsonProperty("USD")
    public Double getUSD() {
        return uSD;
    }

    /**
     *
     * @param uSD The USD
     */
    @JsonProperty("USD")
    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    /**
     *
     * @return The zAR
     */
    @JsonProperty("ZAR")
    public Double getZAR() {
        return zAR;
    }

    /**
     *
     * @param zAR The ZAR
     */
    @JsonProperty("ZAR")
    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    /**
     *
     * @return The eUR
     */
    @JsonProperty("EUR")
    public Double getEUR() {
        return eUR;
    }

    /**
     *
     * @param eUR The EUR
     */
    @JsonProperty("EUR")
    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

}

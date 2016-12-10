/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hub.domain;

import javax.validation.Valid;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "base",
    "date",
    "rates"
})
public class ECBRate {

    @JsonProperty("base")
    private String base;
    @JsonProperty("date")
    private String date;
    @JsonProperty("rates")
    @Valid
    private ECBRates rates;

    /**
     *
     * @return The base
     */
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     *
     * @param base The base
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    /**
     *
     * @return The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return The rates
     */
    @JsonProperty("rates")
    public ECBRates getECBRates() {
        return rates;
    }

    /**
     *
     * @param rates The rates
     */
    @JsonProperty("rates")
    public void setECBRates(ECBRates rates) {
        this.rates = rates;
    }

}

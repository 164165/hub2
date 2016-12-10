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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchangeRatesTable"
})
@XmlRootElement(name = "ArrayOfExchangeRatesTable")
public class NBPArrayOfExchangeRatesTable {

    @XmlElement(name = "ExchangeRatesTable", required = true)
    protected NBPExchangeRatesTable exchangeRatesTable;

    /**
     * Gets the value of the exchangeRatesTable property.
     * 
     * @return
     *     possible object is
     *     {@link NBPExchangeRatesTable }
     *     
     */
    public NBPExchangeRatesTable getNBPExchangeRatesTable() {
        return exchangeRatesTable;
    }

    /**
     * Sets the value of the exchangeRatesTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link NBPExchangeRatesTable }
     *     
     */
    public void setNBPExchangeRatesTable(NBPExchangeRatesTable value) {
        this.exchangeRatesTable = value;
    }

}

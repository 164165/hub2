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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rate"
})
@XmlRootElement(name = "Rates")
public class NBPRates {

    @XmlElement(name = "Rate")
    protected List<NBPRate> rate;

    public List<NBPRate> getNBPRate() {
        if (rate == null) {
            rate = new ArrayList<NBPRate>();
        }
        return this.rate;
    }

}

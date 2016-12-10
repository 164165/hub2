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

public class NBPArrayOfExchangeRatesTableService {

    private NBPArrayOfExchangeRatesTable ratesTable;
    
    
    private static final NBPArrayOfExchangeRatesTableService sinstance = new NBPArrayOfExchangeRatesTableService();
    
    private NBPArrayOfExchangeRatesTableService() {
       
    }
    
    public static NBPArrayOfExchangeRatesTableService getInstance() {
        return sinstance;
    }
    

    public NBPArrayOfExchangeRatesTable getRatesTable() {
        return ratesTable;
    }

    public void setRatesTable(NBPArrayOfExchangeRatesTable ratesTable) {
        this.ratesTable = ratesTable;
    }

    public NBPArrayOfExchangeRatesTableService(NBPArrayOfExchangeRatesTable ratesTable) {
        this.ratesTable = ratesTable;
    }
/*
    public NBPArrayOfExchangeRatesTableService() {
        this.ratesTable = new NBPArrayOfExchangeRatesTable();
    }
*/
}

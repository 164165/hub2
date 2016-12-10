/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hub.client;

/**
 *
 * @author marek
 */
import org.hub.domain.NBPArrayOfExchangeRatesTable;
import org.hub.domain.ECBRate;
import org.hub.service.NBPArrayOfExchangeRatesTableService;
import org.hub.service.ECBRatesService;
import org.hub.service.XchangeRatesService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

public class HubClient {

    private final ECBRatesService ecbService = ECBRatesService.getInstance();
    private final NBPArrayOfExchangeRatesTableService nbpService = NBPArrayOfExchangeRatesTableService.getInstance();
    private final XchangeRatesService xchangeService =XchangeRatesService.getInstance();

    public void getRates() {
        
        ClientConfig nbpConfig = new DefaultClientConfig();
        Client nbpClient = Client.create(nbpConfig);
        
        try {
            WebResource resource = nbpClient.resource("http://api.nbp.pl/api/exchangerates/tables/A/");
            ClientResponse response = resource.accept("application/xml").get(ClientResponse.class);
            if (response.getStatus() == 200) {

                NBPArrayOfExchangeRatesTable output = response.getEntity(NBPArrayOfExchangeRatesTable.class);
                nbpService.setRatesTable(output);
            } else {
                System.out.println("Error..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            nbpClient.destroy();
        }

        ClientConfig ecbConfig = new DefaultClientConfig();
        ecbConfig.getClasses().add(JacksonJaxbJsonProvider.class);
        ecbConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

        Client ecbClient = Client.create(ecbConfig);
        try {

            WebResource resource2 = ecbClient.resource("http://api.fixer.io/latest?base=PLN");
            ClientResponse response2 = resource2.accept("application/json").get(ClientResponse.class);
            if (response2.getStatus() == 200) {

                ECBRate output = response2.getEntity(ECBRate.class);
                ecbService.setEcbRate(output);
                xchangeService.setRates(ecbService.getEcbRate().getECBRates(), nbpService.getRatesTable());

            } else {
                System.out.println("Error..!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ecbClient.destroy();
        }

    }
 

}

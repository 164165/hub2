/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hub.resource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.hub.client.HubClient;
import org.hub.domain.XchangeRates;
import org.hub.service.XchangeRatesService;

/**
 * REST Web Service
 *
 * @author marek
 */
@Path("/rates")
public class XchangeResource {

    @Context
    private UriInfo context;

    public XchangeResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public XchangeRates getXml() {

        XchangeRatesService xcService = XchangeRatesService.getInstance();

        if (xcService.getRates().getXDate() != null) {
            String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            String xDate = new SimpleDateFormat("yyyyMMdd").format(xcService.getRates().getXDate().toGregorianCalendar().getTime());
            // System.out.println("timestamp: "+timeStamp +"  xDate: "+ xDate);
            if (!timeStamp.equals(xDate)) {
                HubClient client = new HubClient();
                client.getRates();
            }
        } else {
            // System.out.println("First run");
            HubClient client = new HubClient();
            client.getRates();
        }

        return XchangeRatesService.getInstance().getRates();


    }

}

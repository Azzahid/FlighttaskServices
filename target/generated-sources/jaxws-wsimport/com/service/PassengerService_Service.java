
package com.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PassengerService", targetNamespace = "http://service.com/", wsdlLocation = "http://localhost:8080/flightApp/PassengerService?wsdl")
public class PassengerService_Service
    extends Service
{

    private final static URL PASSENGERSERVICE_WSDL_LOCATION;
    private final static WebServiceException PASSENGERSERVICE_EXCEPTION;
    private final static QName PASSENGERSERVICE_QNAME = new QName("http://service.com/", "PassengerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/flightApp/PassengerService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PASSENGERSERVICE_WSDL_LOCATION = url;
        PASSENGERSERVICE_EXCEPTION = e;
    }

    public PassengerService_Service() {
        super(__getWsdlLocation(), PASSENGERSERVICE_QNAME);
    }

    public PassengerService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PASSENGERSERVICE_QNAME, features);
    }

    public PassengerService_Service(URL wsdlLocation) {
        super(wsdlLocation, PASSENGERSERVICE_QNAME);
    }

    public PassengerService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PASSENGERSERVICE_QNAME, features);
    }

    public PassengerService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PassengerService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PassengerService
     */
    @WebEndpoint(name = "PassengerServicePort")
    public PassengerService getPassengerServicePort() {
        return super.getPort(new QName("http://service.com/", "PassengerServicePort"), PassengerService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PassengerService
     */
    @WebEndpoint(name = "PassengerServicePort")
    public PassengerService getPassengerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.com/", "PassengerServicePort"), PassengerService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PASSENGERSERVICE_EXCEPTION!= null) {
            throw PASSENGERSERVICE_EXCEPTION;
        }
        return PASSENGERSERVICE_WSDL_LOCATION;
    }

}

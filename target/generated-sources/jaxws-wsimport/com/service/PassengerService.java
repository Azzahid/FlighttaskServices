
package com.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PassengerService", targetNamespace = "http://service.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PassengerService {


    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<com.service.Passenger>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPassengerByUserId", targetNamespace = "http://service.com/", className = "com.service.GetPassengerByUserId")
    @ResponseWrapper(localName = "getPassengerByUserIdResponse", targetNamespace = "http://service.com/", className = "com.service.GetPassengerByUserIdResponse")
    @Action(input = "http://service.com/PassengerService/getPassengerByUserIdRequest", output = "http://service.com/PassengerService/getPassengerByUserIdResponse")
    public List<Passenger> getPassengerByUserId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param passenger
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePassenger", targetNamespace = "http://service.com/", className = "com.service.UpdatePassenger")
    @ResponseWrapper(localName = "updatePassengerResponse", targetNamespace = "http://service.com/", className = "com.service.UpdatePassengerResponse")
    @Action(input = "http://service.com/PassengerService/updatePassengerRequest", output = "http://service.com/PassengerService/updatePassengerResponse")
    public boolean updatePassenger(
        @WebParam(name = "passenger", targetNamespace = "")
        Passenger passenger);

    /**
     * 
     * @param id
     * @return
     *     returns com.service.Passenger
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPassengerById", targetNamespace = "http://service.com/", className = "com.service.GetPassengerById")
    @ResponseWrapper(localName = "getPassengerByIdResponse", targetNamespace = "http://service.com/", className = "com.service.GetPassengerByIdResponse")
    @Action(input = "http://service.com/PassengerService/getPassengerByIdRequest", output = "http://service.com/PassengerService/getPassengerByIdResponse")
    public Passenger getPassengerById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param passenger
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPassenger", targetNamespace = "http://service.com/", className = "com.service.CreatePassenger")
    @ResponseWrapper(localName = "createPassengerResponse", targetNamespace = "http://service.com/", className = "com.service.CreatePassengerResponse")
    @Action(input = "http://service.com/PassengerService/createPassengerRequest", output = "http://service.com/PassengerService/createPassengerResponse")
    public boolean createPassenger(
        @WebParam(name = "passenger", targetNamespace = "")
        Passenger passenger);

}

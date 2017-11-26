/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camunda.bpm.ordermanagement;

import com.service.BookingService_Service;
import com.service.FlightService_Service;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.ejb.Stateless;
import javax.inject.Named;
import org.camunda.bpm.engine.cdi.jsf.TaskForm;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import javax.xml.ws.WebServiceRef;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.ObjectValue;
/**
 *
 * @author azzah
 */
@Stateless
@Named
public class FlightBP {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/flightApp/FlightService.wsdl")
    private FlightService_Service service;
    public void persistFlight(DelegateExecution delegateExecution) {
         // Get all process variables
        Map<String, Object> variables = delegateExecution.getVariables();
        System.out.println("in persist");
        
        java.lang.String paymentMethod = (String) variables.get("paymentMethod");
        int flightId = Integer.parseInt((String) variables.get("flightId"));
        int userId = Integer.parseInt((String) variables.get("userId"));
        java.lang.String passengerId = (String) variables.get("passengerId");
        
        try { // Call Web Service Operation
            com.service.FlightService port = service.getFlightServicePort();
            // TODO initialize WS operation arguments here
            com.service.Flight flight = new com.service.Flight();
            // TODO process result here
            boolean result = port.createFlight(flight);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
    
    public void addQuota(DelegateExecution delegateExecution) {
        
        Map<String, Object> variables = delegateExecution.getVariables();
        
        try { // Call Web Service Operation
            com.service.FlightService port = service.getFlightServicePort();
            // TODO initialize WS operation arguments here
            int flightId = Integer.parseInt((String) variables.get("flightId"));
            Integer totalPassenger = (Integer) variables.get("passengerCount");
            // TODO process result here
            boolean result = port.addQuota(flightId, totalPassenger);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }
    
    public void decreaseQuota(DelegateExecution delegateExecution) {
        
        Map<String, Object> variables = delegateExecution.getVariables();
        
        try { // Call Web Service Operation
            com.service.FlightService port = service.getFlightServicePort();
            // TODO initialize WS operation arguments here
            int flightId = Integer.parseInt((String) variables.get("flightId"));
            Integer totalPassenger = (Integer) variables.get("passengerCount");
            // TODO process result here
            boolean result = port.decreaseQuota(flightId, totalPassenger);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void checkFlightAvailability(DelegateExecution delegateExecution) {
        Map<String, Object> variables = delegateExecution.getVariables();
        int id = Integer.parseInt((String) variables.get("flightId"));
        java.lang.String passengerId = (String) variables.get("passengerId");
         int totalPassenger = 1;
        for (char a : passengerId.toCharArray()) {
            if(a == ',') {
                totalPassenger++;
            }
        }
        try { // Call Web Service Operation
            com.service.FlightService port = service.getFlightServicePort();
            // TODO initialize WS operation arguments here
            int flightId = id;
            // TODO process result here
            com.service.Flight result = port.getFlightData(flightId);
            boolean status = true;
            if (result.getQuota() < totalPassenger) {
                status = false;
            }
            delegateExecution.setVariable("availability", status);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }
    
    public Boolean getAvailabilityStatus(DelegateExecution delegateExecution) {
        return (Boolean) delegateExecution.getVariable("availability");
    }
    
}

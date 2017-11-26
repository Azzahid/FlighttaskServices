/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camunda.bpm.usermanagement;

import com.service.PassengerService_Service;
import com.service.User;
import java.util.Map;
import javax.ejb.Stateless;
import javax.inject.Named;
import org.camunda.bpm.engine.cdi.jsf.TaskForm;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author azzah
 */

@Stateless
@Named
public class PassengerBP {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/flightApp/PassengerService.wsdl")
    private PassengerService_Service service;
    
    public void persistPassenger(DelegateExecution delegateExecution) {
         // Get all process variables
        Map<String, Object> variables = delegateExecution.getVariables();
        System.out.println("in persist");
        // TODO initialize WS operation arguments here
        com.service.Passenger passenger = new com.service.Passenger();
        // Set order attributes
        User user = new User();
        user.setId(Integer.parseInt((String) variables.get("userId")));

        passenger.setUserId(user);
        passenger.setIdUsed((String) variables.get("idUsed"));
        passenger.setPassengerName((String) variables.get("name"));
        passenger.setIdNumber((String) variables.get("idNumber"));
        Boolean result = false;
        
        try { // Call Web Service Operation
            com.service.PassengerService port = service.getPassengerServicePort();
            
            // TODO process result here
            result = port.createPassenger(passenger);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
// TODO handle custom exceptions here
        }

    }
}

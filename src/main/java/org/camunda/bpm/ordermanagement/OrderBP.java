/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camunda.bpm.ordermanagement;

import com.service.BookingService_Service;
import com.service.ReceiptService_Service;
import java.util.Map;
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
public class OrderBP {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/flightApp/ReceiptService.wsdl")
    private ReceiptService_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/flightApp/BookingService.wsdl")
    private BookingService_Service service;
    
    public void persistBooking(DelegateExecution delegateExecution) {
         // Get all process variables
        Map<String, Object> variables = delegateExecution.getVariables();
        System.out.println("in persist");
        
        try { // Call Web Service Operation
            com.service.BookingService port = service.getBookingServicePort();
            // TODO initialize WS operation arguments here
            java.lang.String paymentMethod = (String) variables.get("paymentMethod");
            int flightId = Integer.parseInt((String) variables.get("flightId"));
            int userId = Integer.parseInt((String) variables.get("userId"));
            java.lang.String passengerId = (String) variables.get("passengerId");
            // TODO process result here
            com.service.Booking result = port.createBooking(paymentMethod, flightId, userId, passengerId);
            System.out.println("Result = "+result);
            ObjectValue typedObjectValue = Variables.objectValue(result).create();
            delegateExecution.setVariable("booking", typedObjectValue);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
    
    public void getReceipt(DelegateExecution execution) 
    {
        ObjectValue retrievedTypedObjectValue = execution.getVariableTyped("booking");
        com.service.Booking retrievedOrder = (com.service.Booking) retrievedTypedObjectValue.getValue();
        try { // Call Web Service Operation
            com.service.ReceiptService port = service_1.getReceiptServicePort();
            // TODO initialize WS operation arguments here
            int bookingId = retrievedOrder.getId();
            // TODO process result here
            java.lang.String result = port.createrReceipt(bookingId);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
    
    public void getBooking(DelegateExecution delegateExecution)
    {
        Map<String, Object> variables = delegateExecution.getVariables();
        try { // Call Web Service Operation
            com.service.BookingService port = service.getBookingServicePort();
            int id = Integer.parseInt((String) variables.get("bookingId"));
            com.service.Booking result = port.getBookingById(id);
            if (result != null) {
                ObjectValue typedObjectValue = Variables.objectValue(result).create();
                delegateExecution.setVariable("booking", typedObjectValue);
                Integer passengerCount = port.getBookingPassengerCount(id);
                delegateExecution.setVariable("passengerCount", passengerCount);
                Integer flightId = result.getFlightId().getId();
                delegateExecution.setVariable("flightId", flightId);
                System.out.println("Sucess getting booking");
            } else {
                delegateExecution.setVariable("booking", null);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Integer getBookingStatus(DelegateExecution execution) {
        ObjectValue retrievedTypedObjectValue = execution.getVariableTyped("booking");
        if (retrievedTypedObjectValue == null) {
            System.out.println("it's null");
            return 3;
        }
        
        com.service.Booking retrievedOrder = (com.service.Booking) retrievedTypedObjectValue.getValue();
        
        if (retrievedOrder.getStatus().toLowerCase().equals("lunas")) {
            return 1;
        } else if (retrievedOrder.getStatus().toLowerCase().equals("pending")) {
            return 2;
        }
        
        return 3;
    }
    
    public Integer getPaymentMethod(DelegateExecution execution) {
        ObjectValue retrievedTypedObjectValue = execution.getVariableTyped("booking");
        if (retrievedTypedObjectValue == null) {
            System.out.println("it's null");
            return 3;
        }
        
        com.service.Booking retrievedOrder = (com.service.Booking) retrievedTypedObjectValue.getValue();
        
        if (retrievedOrder.getPaymentMethod().toLowerCase().equals("transfer")) {
            
            System.out.println("1");
            return 1;
            
        } else if (retrievedOrder.getPaymentMethod().toLowerCase().equals("kredit")) {
            
            System.out.println("2");
            return 2;
        }
        
        return 3;
    }
    
    public void cancelBooking(DelegateExecution delegateExecution) {
        System.out.println("canceled");
        Map<String, Object> variables = delegateExecution.getVariables();
        try {
            com.service.BookingService port = service.getBookingServicePort();
            int id = Integer.parseInt((String) variables.get("bookingId"));
            port.cancelBooking(id);
            System.out.println("cancel booking success");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
    
    public void changeOrderStatus(DelegateExecution delegateExecution) {
        Map<String, Object> variables = delegateExecution.getVariables();
        
        try {
            com.service.BookingService port = service.getBookingServicePort();
            int id = Integer.parseInt((String) variables.get("bookingId"));
            java.lang.String status = "Lunas";
            java.lang.String paymentMethod = "";
            port.modifyBooking(id, status, paymentMethod);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

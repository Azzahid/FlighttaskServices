
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlightsFromAirport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightsFromAirport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationAirportID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureAirportID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsFromAirport", propOrder = {
    "destinationAirportID",
    "departureAirportID"
})
public class GetFlightsFromAirport {

    protected int destinationAirportID;
    protected int departureAirportID;

    /**
     * Gets the value of the destinationAirportID property.
     * 
     */
    public int getDestinationAirportID() {
        return destinationAirportID;
    }

    /**
     * Sets the value of the destinationAirportID property.
     * 
     */
    public void setDestinationAirportID(int value) {
        this.destinationAirportID = value;
    }

    /**
     * Gets the value of the departureAirportID property.
     * 
     */
    public int getDepartureAirportID() {
        return departureAirportID;
    }

    /**
     * Sets the value of the departureAirportID property.
     * 
     */
    public void setDepartureAirportID(int value) {
        this.departureAirportID = value;
    }

}

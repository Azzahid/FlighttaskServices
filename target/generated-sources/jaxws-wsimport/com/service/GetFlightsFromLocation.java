
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFlightsFromLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightsFromLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureLocationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsFromLocation", propOrder = {
    "destinationLocationID",
    "departureLocationID"
})
public class GetFlightsFromLocation {

    protected int destinationLocationID;
    protected int departureLocationID;

    /**
     * Gets the value of the destinationLocationID property.
     * 
     */
    public int getDestinationLocationID() {
        return destinationLocationID;
    }

    /**
     * Sets the value of the destinationLocationID property.
     * 
     */
    public void setDestinationLocationID(int value) {
        this.destinationLocationID = value;
    }

    /**
     * Gets the value of the departureLocationID property.
     * 
     */
    public int getDepartureLocationID() {
        return departureLocationID;
    }

    /**
     * Sets the value of the departureLocationID property.
     * 
     */
    public void setDepartureLocationID(int value) {
        this.departureLocationID = value;
    }

}

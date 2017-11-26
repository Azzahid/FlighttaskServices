
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getFlightsFromAirportAndDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFlightsFromAirportAndDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationAirportID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureAirportID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BoardingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFlightsFromAirportAndDate", propOrder = {
    "destinationAirportID",
    "departureAirportID",
    "boardingTime"
})
public class GetFlightsFromAirportAndDate {

    protected int destinationAirportID;
    protected int departureAirportID;
    @XmlElement(name = "BoardingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boardingTime;

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

    /**
     * Gets the value of the boardingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoardingTime() {
        return boardingTime;
    }

    /**
     * Sets the value of the boardingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoardingTime(XMLGregorianCalendar value) {
        this.boardingTime = value;
    }

}

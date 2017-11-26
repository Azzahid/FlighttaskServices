
package com.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for createFlightFromData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createFlightFromData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationAirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureAirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "createFlightFromData", propOrder = {
    "destinationAirportId",
    "departureAirportId",
    "company",
    "quota",
    "price",
    "quality",
    "boardingTime"
})
public class CreateFlightFromData {

    protected int destinationAirportId;
    protected int departureAirportId;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Quota")
    protected int quota;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Quality")
    protected String quality;
    @XmlElement(name = "BoardingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boardingTime;

    /**
     * Gets the value of the destinationAirportId property.
     * 
     */
    public int getDestinationAirportId() {
        return destinationAirportId;
    }

    /**
     * Sets the value of the destinationAirportId property.
     * 
     */
    public void setDestinationAirportId(int value) {
        this.destinationAirportId = value;
    }

    /**
     * Gets the value of the departureAirportId property.
     * 
     */
    public int getDepartureAirportId() {
        return departureAirportId;
    }

    /**
     * Sets the value of the departureAirportId property.
     * 
     */
    public void setDepartureAirportId(int value) {
        this.departureAirportId = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     */
    public int getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     */
    public void setQuota(int value) {
        this.quota = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuality(String value) {
        this.quality = value;
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

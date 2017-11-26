
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookingPassengerResponse_QNAME = new QName("http://service.com/", "getBookingPassengerResponse");
    private final static QName _Airport_QNAME = new QName("http://service.com/", "airport");
    private final static QName _Destination_QNAME = new QName("http://service.com/", "destination");
    private final static QName _GetBookingPassenger_QNAME = new QName("http://service.com/", "getBookingPassenger");
    private final static QName _CancelBooking_QNAME = new QName("http://service.com/", "cancelBooking");
    private final static QName _GetBookingById_QNAME = new QName("http://service.com/", "getBookingById");
    private final static QName _CreateBookingResponse_QNAME = new QName("http://service.com/", "CreateBookingResponse");
    private final static QName _Flight_QNAME = new QName("http://service.com/", "flight");
    private final static QName _GetBookingPassengerCount_QNAME = new QName("http://service.com/", "getBookingPassengerCount");
    private final static QName _Booking_QNAME = new QName("http://service.com/", "booking");
    private final static QName _User_QNAME = new QName("http://service.com/", "user");
    private final static QName _CreateBooking_QNAME = new QName("http://service.com/", "CreateBooking");
    private final static QName _GetBookingByIdResponse_QNAME = new QName("http://service.com/", "getBookingByIdResponse");
    private final static QName _Departure_QNAME = new QName("http://service.com/", "departure");
    private final static QName _Hello_QNAME = new QName("http://service.com/", "hello");
    private final static QName _Location_QNAME = new QName("http://service.com/", "location");
    private final static QName _ModifyBooking_QNAME = new QName("http://service.com/", "ModifyBooking");
    private final static QName _Passenger_QNAME = new QName("http://service.com/", "passenger");
    private final static QName _HelloResponse_QNAME = new QName("http://service.com/", "helloResponse");
    private final static QName _GetBookingPassengerCountResponse_QNAME = new QName("http://service.com/", "getBookingPassengerCountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBookingResponse }
     * 
     */
    public CreateBookingResponse createCreateBookingResponse() {
        return new CreateBookingResponse();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link GetBookingPassengerCount }
     * 
     */
    public GetBookingPassengerCount createGetBookingPassengerCount() {
        return new GetBookingPassengerCount();
    }

    /**
     * Create an instance of {@link CancelBooking }
     * 
     */
    public CancelBooking createCancelBooking() {
        return new CancelBooking();
    }

    /**
     * Create an instance of {@link GetBookingById }
     * 
     */
    public GetBookingById createGetBookingById() {
        return new GetBookingById();
    }

    /**
     * Create an instance of {@link GetBookingPassenger }
     * 
     */
    public GetBookingPassenger createGetBookingPassenger() {
        return new GetBookingPassenger();
    }

    /**
     * Create an instance of {@link Destination }
     * 
     */
    public Destination createDestination() {
        return new Destination();
    }

    /**
     * Create an instance of {@link GetBookingPassengerResponse }
     * 
     */
    public GetBookingPassengerResponse createGetBookingPassengerResponse() {
        return new GetBookingPassengerResponse();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link GetBookingPassengerCountResponse }
     * 
     */
    public GetBookingPassengerCountResponse createGetBookingPassengerCountResponse() {
        return new GetBookingPassengerCountResponse();
    }

    /**
     * Create an instance of {@link ModifyBooking }
     * 
     */
    public ModifyBooking createModifyBooking() {
        return new ModifyBooking();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetBookingByIdResponse }
     * 
     */
    public GetBookingByIdResponse createGetBookingByIdResponse() {
        return new GetBookingByIdResponse();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Departure }
     * 
     */
    public Departure createDeparture() {
        return new Departure();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CreateBooking }
     * 
     */
    public CreateBooking createCreateBooking() {
        return new CreateBooking();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPassengerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingPassengerResponse")
    public JAXBElement<GetBookingPassengerResponse> createGetBookingPassengerResponse(GetBookingPassengerResponse value) {
        return new JAXBElement<GetBookingPassengerResponse>(_GetBookingPassengerResponse_QNAME, GetBookingPassengerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Airport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "airport")
    public JAXBElement<Airport> createAirport(Airport value) {
        return new JAXBElement<Airport>(_Airport_QNAME, Airport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "destination")
    public JAXBElement<Destination> createDestination(Destination value) {
        return new JAXBElement<Destination>(_Destination_QNAME, Destination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingPassenger")
    public JAXBElement<GetBookingPassenger> createGetBookingPassenger(GetBookingPassenger value) {
        return new JAXBElement<GetBookingPassenger>(_GetBookingPassenger_QNAME, GetBookingPassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "cancelBooking")
    public JAXBElement<CancelBooking> createCancelBooking(CancelBooking value) {
        return new JAXBElement<CancelBooking>(_CancelBooking_QNAME, CancelBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingById")
    public JAXBElement<GetBookingById> createGetBookingById(GetBookingById value) {
        return new JAXBElement<GetBookingById>(_GetBookingById_QNAME, GetBookingById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "CreateBookingResponse")
    public JAXBElement<CreateBookingResponse> createCreateBookingResponse(CreateBookingResponse value) {
        return new JAXBElement<CreateBookingResponse>(_CreateBookingResponse_QNAME, CreateBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "flight")
    public JAXBElement<Flight> createFlight(Flight value) {
        return new JAXBElement<Flight>(_Flight_QNAME, Flight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPassengerCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingPassengerCount")
    public JAXBElement<GetBookingPassengerCount> createGetBookingPassengerCount(GetBookingPassengerCount value) {
        return new JAXBElement<GetBookingPassengerCount>(_GetBookingPassengerCount_QNAME, GetBookingPassengerCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Booking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "booking")
    public JAXBElement<Booking> createBooking(Booking value) {
        return new JAXBElement<Booking>(_Booking_QNAME, Booking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "CreateBooking")
    public JAXBElement<CreateBooking> createCreateBooking(CreateBooking value) {
        return new JAXBElement<CreateBooking>(_CreateBooking_QNAME, CreateBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingByIdResponse")
    public JAXBElement<GetBookingByIdResponse> createGetBookingByIdResponse(GetBookingByIdResponse value) {
        return new JAXBElement<GetBookingByIdResponse>(_GetBookingByIdResponse_QNAME, GetBookingByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Departure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "departure")
    public JAXBElement<Departure> createDeparture(Departure value) {
        return new JAXBElement<Departure>(_Departure_QNAME, Departure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "ModifyBooking")
    public JAXBElement<ModifyBooking> createModifyBooking(ModifyBooking value) {
        return new JAXBElement<ModifyBooking>(_ModifyBooking_QNAME, ModifyBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Passenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "passenger")
    public JAXBElement<Passenger> createPassenger(Passenger value) {
        return new JAXBElement<Passenger>(_Passenger_QNAME, Passenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingPassengerCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "getBookingPassengerCountResponse")
    public JAXBElement<GetBookingPassengerCountResponse> createGetBookingPassengerCountResponse(GetBookingPassengerCountResponse value) {
        return new JAXBElement<GetBookingPassengerCountResponse>(_GetBookingPassengerCountResponse_QNAME, GetBookingPassengerCountResponse.class, null, value);
    }

}

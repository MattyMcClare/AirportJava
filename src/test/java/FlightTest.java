import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        flight = new Flight(548, "GLA");
        passenger = new Passenger("Stefan");
    }

    @Test
    public void startWithNoPlane(){
        assertEquals(null, flight.getPlane());
    }
    
    @Test
    public void hasFlightNumber(){
        assertEquals(548, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canAddPlane(){
        flight.addPlane(plane);
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void bookingsListStartEmpty(){
        assertEquals(0, flight.bookingsCount());
    }

    @Test
    public void canAddBooking(){
        flight.addPlane(plane);
        flight.addBooking(passenger);
        flight.addBooking(passenger);
        flight.addBooking(passenger);
        assertEquals(3, flight.bookingsCount());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPlane(plane);
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.passengersCount());
    }
}

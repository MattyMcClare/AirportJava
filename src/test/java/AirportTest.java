import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Plane plane1;
    Flight flight;
    Flight flight1;
    Hangar hangar;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        plane1 = new Plane("BritishAir", PlaneCapacity.BOEING747);
        flight = new Flight(548, "GLA");
        flight1 = new Flight(123, "GLA");
        airport = new Airport("GLA");
        hangar = new Hangar("private");
        passenger = new Passenger("Janusz");
    }

    @Test
    public void isEmpty(){
        assertEquals(0, airport.hangarsCount());
    }

    @Test
    public void hasType(){
        assertEquals("GLA", airport.getType());
    }

    @Test
    public void hasNoFlights(){
        assertEquals(0, airport.flightCount());
    }

    @Test
    public void canCreateFlight(){
        airport.createFlight(flight);
        assertEquals(1, airport.flightCount());
    }

    @Test
    public void canAssignPlaneToFlight(){
        hangar.addPlaneToHangar(plane);
        airport.assignPlaneToFlight(plane, flight1, hangar);
        assertEquals(0, hangar.planeCount());
        assertEquals(plane, flight1.getPlane());
    }

    @Test
    public void canSellTicketForFlight(){
        airport.assignPlaneToFlight(plane, flight1, hangar);
        airport.sellTicketForFlight(flight1, passenger);
        assertEquals(1, flight1.passengersCount());
    }

    @Test
    public void flightOverBooked(){
        airport.assignPlaneToFlight(plane1, flight1, hangar);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        assertEquals(4, flight1.passengersCount());
    }

    @Test
    public void canMovePassengersToPlane(){
        airport.assignPlaneToFlight(plane, flight, hangar);
        airport.assignPlaneToFlight(plane1, flight1, hangar);
        flight.addBooking(passenger);
        flight1.addBooking(passenger);
        flight1.addBooking(passenger);
        flight1.addBooking(passenger);
        airport.sellTicketForFlight(flight, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        airport.sellTicketForFlight(flight1, passenger);
        assertEquals(0,flight.bookingsCount());
        assertEquals(0, flight1.bookingsCount());
        assertEquals(1, flight.passengersCount());
        assertEquals(3, flight1.passengersCount());
    }

//    @Test
//    public void canAssignRightPlane(){
//        flight1.addBooking(passenger);
//        flight1.addBooking(passenger);
//        flight1.addBooking(passenger);
//        airport.assignPlaneToFlight(flight, hangar);
//    }

}

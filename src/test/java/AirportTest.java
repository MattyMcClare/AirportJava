import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;
    Flight flight1;
    Hangar hangar;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        flight = new Flight(plane, 548, "GLA");
        flight1 = new Flight(null, 548, "GLA");
        airport = new Airport("GLA");
        hangar = new Hangar("private");
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
}

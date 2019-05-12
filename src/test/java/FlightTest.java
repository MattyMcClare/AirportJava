import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        flight = new Flight(plane, 548, "GLA");
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
}

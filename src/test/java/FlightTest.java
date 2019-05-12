import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        flight = new Flight(PlaneCapacity.AIRBUS320, 548, "GLA");
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneCapacity.AIRBUS320, flight.getPlane());
    }
    
    @Test
    public void hasFlightNumber(){
        assertEquals(548, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight.getDestination());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight("AirBus320", 548, "GLA");
    }

    @Test
    public void hasPlane(){
        assertEquals("AirBus320", flight.getPlane());
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

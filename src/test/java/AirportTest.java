import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        flight = new Flight(plane, 548, "GLA");
        airport = new Airport("GLA");
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

}

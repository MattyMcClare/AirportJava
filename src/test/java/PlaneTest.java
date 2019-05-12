import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        passenger = new Passenger("Stefan");
    }

    @Test
    public void hasAirline(){

        assertEquals("AirBerlin", plane.getAirline());
    }


    @Test
    public void canGetMaxCapacity(){
        assertEquals(PlaneCapacity.AIRBUS320, plane.getType());
    }

    @Test
    public void planeIsEmpty(){
        assertEquals(0, plane.passengersCount());
    }
    @Test
    public void canAddPassengerToAPlane(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.passengersCount());
    }
}

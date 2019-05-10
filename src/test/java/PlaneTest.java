import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320, 12);
    }

    @Test
    public void hasAirline(){
        assertEquals("AirBerlin", getAirline());
    }

    @Test
    public void planeIsEmpty(){
        assertEquals(0, planePassengersCount());
    }

    @Test
    public void canGetMaxCapacity(){
        assertEquals(PlaneCapacity, plane.getMaxCapacity());
    }
}

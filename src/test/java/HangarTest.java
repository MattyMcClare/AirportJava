import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Plane plane;
    Hangar hangar;

    @Before
    public void before(){
        plane = new Plane("AirBerlin", PlaneCapacity.AIRBUS320);
        hangar = new Hangar("private");
    }

    @Test
    public void hasType(){
        assertEquals("private", hangar.getType());
    }

    @Test
    public void isEmpty(){
        assertEquals(0, hangar.planeCount());
    }

    @Test
    public void canAddPlaneToHangar(){
        hangar.addPlaneToHangar(plane);
        assertEquals(1, hangar.planeCount());
    }

    @Test
    public void canRemovePlaneFromHangar(){
        hangar.addPlaneToHangar(plane);
        hangar.removePlane(plane);
        assertEquals(0, hangar.planeCount());
    }

}

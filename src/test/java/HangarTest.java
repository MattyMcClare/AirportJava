import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;

    @Before
    public void before(){
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

}

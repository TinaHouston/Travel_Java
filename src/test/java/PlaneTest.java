import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
       plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void canGetModel(){
        assertEquals(PlaneType.BOEING737, plane.getModel());
    }

    @Test
    public void canGetPassengerCapacity(){
        assertEquals(70, plane.getPassengerCapacityFromEnum());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(140, plane.getTotalWeightFromEnum());
    }
}

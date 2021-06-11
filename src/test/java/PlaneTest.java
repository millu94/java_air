import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.MINIPLANE);
    }

    @Test
    public void checkPlaneHasType(){
        assertEquals(PlaneType.MINIPLANE, plane1.getPlaneType());
    }

    @Test
    public void checkPlaneHasCapacity(){
        assertEquals(10, plane1.getCapacity());
    }

    @Test
    public void checkPlaneHasWeight(){
        assertEquals(69000, plane1.getWeight());
    }



}

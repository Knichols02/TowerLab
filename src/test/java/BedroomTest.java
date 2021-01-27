import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom (7, 1, "single");
        guest =new Guest ("Nargis");
    }

    @Test
    public void getRoomNumber(){
        assertEquals(7, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals("single", bedroom.getRoomType());
    }

    @Test
    public void getCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

}

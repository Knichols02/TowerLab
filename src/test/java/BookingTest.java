import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(6, 2, "double");
        booking = new Booking( bedroom, 2);
    }

//    @Test
//    public void hasNumberOfNights(){
//        assertEquals(2, booking.getNumberOfNights());
//    }

//    @Test
//    public void hasBedroom(){
//        assertEquals(bedroom, booking.getBedroom());
//    }





}

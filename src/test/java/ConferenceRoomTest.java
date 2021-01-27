import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom( 2, "Planning Suite");
    }


    @Test
    public void canGetCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Planning Suite", conferenceRoom.getRoomName());
    }
}

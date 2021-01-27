import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Guest guest;
    private Guest guest2;
    private Guest guest3;

    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private ConferenceRoom conferenceRoom;
    private ConferenceRoom conferenceRoom2;

    private Booking bookingForm;


    @Before
    public void before(){
        hotel = new Hotel();

        guest = new Guest("Bugs Bunny");
        guest2 = new Guest("Woody Woodpecker");
        guest3 = new Guest( "Pink Panther");

        bedroom = new Bedroom(1, 2, "Double");
        bedroom2 = new Bedroom(2, 3, "Penthouse");
        bedroom3 = new Bedroom(3, 2, "HoneyMoon Suite");

        conferenceRoom = new ConferenceRoom(2, "Marilyn Monroe");
        conferenceRoom2 = new ConferenceRoom(3, "Himalayas");


    }

    @Test
    public void canAddGuest(){
        hotel.addGuest(guest);
        assertEquals(1, hotel.countGuest());
    }

    @Test
    public void canRemoveGuest(){
        hotel.addGuest(guest);
        hotel.removeGuest(guest);
        assertEquals(0, hotel.countGuest());
    }

    @Test
    public void canCountGuests(){
        hotel.addGuest(guest2);
        assertEquals(1, hotel.countGuest());
    }

    @Test
    public void canAddGuestToRoom(){
        //add a guest to the hotel
        hotel.addGuest(guest);
        //remove guest from hotel
        hotel.removeGuest(guest);
        //add guest to bedroom
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.countGuestsInRoom());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuestToRoom(guest);
        //remove guest from room
        bedroom.removeGuestFromRoom(guest);
        assertEquals(0, bedroom.countGuestsInRoom());
    }

//    @Test
//    public void canMakeABooking(){
//        Booking booking = hotel.createBooking(bedroom, 2);
//        assertEquals(1, booking.countBookings());
//
//
//        //booking form
//        //book a room/make a booking - add a room to the booking form
//        //expecting is 1, bookingForm.countBookin
//
//    }

}

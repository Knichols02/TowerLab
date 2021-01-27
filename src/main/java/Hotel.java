import java.util.ArrayList;

public class Hotel {

    private ArrayList<Guest> guests;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom>ConferenceRooms;

    public Hotel(){
        this.guests = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
        this.ConferenceRooms = new ArrayList<>();

    }

    public int countGuest() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}

import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guestCollection;

    public Bedroom (int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = type;
        this.guestCollection = new ArrayList<>();
    }


    public Object getCapacity() {
        return capacity;
    }

    public Object getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addGuestToRoom(Guest guest) {
        guestCollection.add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        guestCollection.remove(guest);
    }

    public int countGuestsInRoom() {
        return guestCollection.size();
    }
}

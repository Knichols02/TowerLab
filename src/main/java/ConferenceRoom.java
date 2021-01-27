import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private String name;
    private ArrayList<Guest> guestCollection;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestCollection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomName() {
        return name;
    }

    public ArrayList<Guest> getGuestCollection() {
        return guestCollection;
    }

//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGuestCollection(ArrayList<Guest> guestCollection) {
//        this.guestCollection = guestCollection;
//    }
}

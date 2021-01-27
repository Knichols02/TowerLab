
public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
    }

    public int getNumberOfNights(){
        return nightsBooked;
    }

    public Bedroom getBedroom(){
        return bedroom;
    }

}

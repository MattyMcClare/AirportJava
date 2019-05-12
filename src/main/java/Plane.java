import java.util.ArrayList;

public class Plane {

    private PlaneCapacity type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(String airline, PlaneCapacity type) {
        this.airline = airline;
        this.type = type;
        this.passengers = new ArrayList<>();
    }

    public PlaneCapacity getType() {
        return type;
    }

    public String getAirline() {
        return airline;
    }

    public int planePassengersCount() {
        return passengers.size();
    }
}

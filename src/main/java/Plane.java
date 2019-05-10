import java.util.ArrayList;

public class Plane {

    private PlaneCapacity maxCapacity;
    private String airline;
    private ArrayList<Passenger> passenger;

    public Plane(String airline, PlaneCapacity maxCapacity) {
        this.airline = airline;
        this.maxCapacity = maxCapacity;
        this.passenger = new ArrayList<>();
    }

    public PlaneCapacity getMaxCapacity() {
        return maxCapacity;
    }

    public String getAirline() {
        return airline;
    }

}

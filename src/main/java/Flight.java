import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private ArrayList<Passenger> bookingsList;

    public Flight(int flightNumber, String destination) {
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.bookingsList = new ArrayList<>();
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void addPlane(Plane plane) {
        this.plane = plane;
    }

    public int bookingsCount() {
        return bookingsList.size();
    }

    public void addBooking(Passenger passenger) {
        bookingsList.add(passenger);
    }

    public void addPassengerToFlight(Passenger passenger) {
        bookingsList.remove(passenger);
        plane.addPassenger(passenger);
    }

    public int passengersCount() {
        return plane.passengersCount();
    }
}

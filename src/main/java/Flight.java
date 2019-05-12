public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(Plane plane, int flightNumber, String destination) {
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
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
}

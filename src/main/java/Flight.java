public class Flight {

    private PlaneCapacity plane;
    private int flightNumber;
    private String destination;

    public Flight(PlaneCapacity plane, int flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public PlaneCapacity getPlane() {
        return plane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }
}

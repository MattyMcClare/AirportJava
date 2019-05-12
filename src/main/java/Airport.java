import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangars;
    private String airportCode;
    private ArrayList<Flight> flights;

    public Airport(String airportCode) {
        this.hangars = new ArrayList<>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();

    }

    public int hangarsCount() {
        return hangars.size();
    }

    public String getType() {
        return airportCode;
    }

    public int flightCount() {
        return flights.size();
    }


    public void createFlight(Flight flight) {
        flights.add(flight);
    }

    public void assignPlaneToFlight(Plane plane, Flight flight, Hangar hangar) {
        hangar.removePlane(plane);
        flight.addPlane(plane);
    }

    public void sellTicketForFlight(Flight flight, Passenger passenger) {
        flight.addPassengerToFlight(passenger);
    }
}

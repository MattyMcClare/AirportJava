import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangars;
    private String airportCode;

    public Airport(String airportCode) {
        this.hangars = new ArrayList<>();
        this.airportCode = airportCode;

    }

    public int hangarsCount() {
        return hangars.size();
    }

    public String getType() {
        return airportCode;
    }


//    public Object createFlight(Plane plane, Flight flight) {
//       return new Flight(plane.getType(), flight.getFlightNumber(), flight.getDestination());
//    }
}

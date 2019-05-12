import java.util.ArrayList;
import java.util.Collections;

public class Hangar {
    private String type;
    private ArrayList<Plane> planes;

    public Hangar(String type) {
        this.type = type;
        this.planes = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int planeCount(){
        return planes.size();
    }

    public void addPlaneToHangar(Plane plane) {
        planes.add(plane);
    }


    public void removePlane(Plane plane) {
        planes.remove(plane);
    }

//    public Plane assignBestPlaneToFlight(Flight flight){
//        ArrayList<Plane> bestPlanes;
//        bestPlanes = new ArrayList<>();
//        for(Plane plane : planes){
//            if(plane.getType().getValue() >= flight.bookingsCount()){
//                bestPlanes.add(plane);
//            }
//        }
//        Collections.sort(bestPlanes);
//    }
}
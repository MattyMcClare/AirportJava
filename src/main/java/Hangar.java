import java.util.ArrayList;

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
}

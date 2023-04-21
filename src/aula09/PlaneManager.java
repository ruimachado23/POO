package aula09;
import java.util.ArrayList;

public class PlaneManager {
    private ArrayList<Plane> planes = new ArrayList<Plane>();

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(Plane plane) {
        if (planes.contains(plane)) {
            planes.remove(plane);
        }
        else{
            System.out.println("O avião não existe");
        }
    }

    public void searchPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                System.out.println(plane);
            }
        }
    }

    public void listComercialPlanes() {
        for (Plane plane : planes) {
            if (plane.getTipo() == Tipo.COMERCIAL) {
                System.out.println(plane);
            }
        }
    }

    public void listMilitaryPlanes() {
        for (Plane plane : planes) {
            if (plane.getTipo() == Tipo.MILITAR) {
                System.out.println(plane);
            }
        }
    }

    public void listPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    public void getFastestPlane(){
        Plane fastestPlane = planes.get(0);
        for (Plane plane : planes) {
            if (plane.getVelmax() > fastestPlane.getVelmax()) {
                fastestPlane = plane;
            }
        }
        System.out.println(fastestPlane);
    }
}

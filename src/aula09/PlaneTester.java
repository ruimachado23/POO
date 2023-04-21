package aula09;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();

        Plane CP1 = new CommercialPlane("CP1", "Boeing 747", "Boeing", 2010, 500, 900, Tipo.COMERCIAL, 100);
        Plane CP2 = new CommercialPlane("CP2", "Boeing 747", "Boeing", 2010, 500, 900, Tipo.COMERCIAL, 100);
        Plane MP1 = new MilitaryPlane("MP1", "F-16", "Lockheed Martin", 2010, 2000, 100, Tipo.MILITAR, 100);
        Plane MP2 = new MilitaryPlane("MP2", "F-16", "Lockheed Martin", 2010, 2000, 100,  Tipo.MILITAR, 100);
        Plane MP3 = new MilitaryPlane("MP3", "F-16", "Lockheed Martin", 2010, 2000, 100,  Tipo.MILITAR, 100);


        planeManager.addPlane(CP1);
        planeManager.addPlane(CP2);
        planeManager.addPlane(MP1);
        planeManager.addPlane(MP2);
        planeManager.addPlane(MP3);


        planeManager.addPlane(new MilitaryPlane("MP3", "F-16", "Lockheed Martin", 2010, 2000, 100,  Tipo.MILITAR, 100));
        planeManager.removePlane(MP3);

        System.out.println("Search Plane MP1: ");
        planeManager.searchPlane("MP1");

        System.out.println("\nList Planes: ");
        planeManager.listPlanes();

        System.out.println("\nList Commercial Planes: ");
        planeManager.listComercialPlanes();

        System.out.println("\nFastest Plane: ");
        planeManager.getFastestPlane();


    }
}
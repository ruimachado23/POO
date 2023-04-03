package aula05;
import java.util.ArrayList;

class RealEstate {
    private ArrayList<Property> properties;
    private int nextId;

    public RealEstate() {
        properties = new ArrayList<Property>();
        nextId = 1000;
    }

    public int newProperty(int rooms, String location, double price) {
        Property property = new Property(nextId, location, rooms, price);
        properties.add(property);
        nextId++;
        return property.getId();
    }

    public void sell(int id) {
        Property property = findPropertyById(id);
        if (property != null) {
            property.sell();
            System.out.println("Imóvel " + id + " vendido.");
        } else {
            System.out.println("Imóvel " + id + " não existe.");
        }
    }

    public void setAuction(int id, DateYMD startDate, int durationDays) {
        Property property = findPropertyById(id);
        if (property != null) {
            property.setAuction(startDate, durationDays);
        } else {
            System.out.println("Imóvel " + id + " não existe.");
        }
    }

    private Property findPropertyById(int id) {
        for (Property property : properties) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Propriedades:\n");
        for (Property property : properties) {
            sb.append(property.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
package aula07;

public class Objeto_Movel {
    private double distance;
    private double newy;
    private double newx;

    public Objeto_Movel(double distance, double newy, double newx) {
        this.distance = distance;
        this.newy = newy;
        this.newx = newx;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getNewy() {
        return this.newy;
    }

    public void setNewy(double newy) {
        this.newy = newy;
    }

    public double getNewx() {
        return this.newx;
    }

    public void setNewx(double newx) {
        this.newx = newx;
    }
    
    public int move(int newx, int newy) {
        int distance = (int) Math.sqrt(Math.pow(newx, 2) + Math.pow(newy, 2));
        return distance;
    }
        
}

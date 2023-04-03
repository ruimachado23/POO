package aula07;

public class Circle extends Forma {
    private double raio;
    private String color;

    public Circle(double r, String color) {
        setRaio(r);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * (raio * raio);
    }

    public double getPerimeter() {
        return Math.PI * (2 * raio);
    }

    public double setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        }
        return raio;
    }

    public String toString() {
        return "Tipo: Circulo" + "\nRaio: " + raio + "\nPerímetro: " + getPerimeter() + "\nArea: " + getArea()
                + "\nCor: " + getColor();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.raio == c.raio && this.color.equals(c.color);
        }
        return false;
    }

}
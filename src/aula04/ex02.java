package aula04;
import java.util.ArrayList;


class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


class CashRegister {
    private ArrayList<Product> products;
    public ArrayList<Product> getProducts() {
        return products;
    }
    public CashRegister() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalValue() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalValue();
        }
        return total;
    }

    public String toString() {
        String s = "CashRegister[";
        for (Product p : products) {
            s += p.getName() + " (" + p.getPrice() + " x " + p.getQuantity() + "), ";
        }
        s += "Total: " + getTotalValue() + "]";
        return s;
    }
}

public class ex02 {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));

        System.out.printf("%-15s %-10s %-10s %-10s%n", "Product", "Price", "Quantity", "Total");
        
        for (Product p : cr.getProducts()) {
            System.out.printf("%-15s %-10.2f %-10d %-10.2f%n", p.getName(), p.getPrice(), p.getQuantity(), p.getTotalValue());
        }

    }
}
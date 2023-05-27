package avaliacao2;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class OrderManager {
    private List<Order> orders;

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(int id) {
        Order order = searchOrder(id);
        if (order != null) {
            orders.remove(order);
        }
    }

    public Order searchOrder(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public double calculateOrderCost(int id) {
        Order order = searchOrder(id);
        if (order != null) {
            OrderCostCalculator costCalculator = new StandardOrderCostCalculator();
            return costCalculator.calculateOrderCost(order);
        }
        return -1;
    }

    public void printAllOrders() {
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    public void readOrdersFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");

                int id = Integer.parseInt(data[0]);
                double price = Double.parseDouble(data[1]);
                String storeId = data[2];
                String clientId = data[3];
                LocalDateTime orderDateTime = LocalDateTime.parse(data[4]);

                Order order = new Order(id, price, storeId, clientId, orderDateTime);
                orders.add(order);
            }
        } catch (IOException e) {
            System.out.println("Error reading orders from file: " + e.getMessage());
        }
    }
}

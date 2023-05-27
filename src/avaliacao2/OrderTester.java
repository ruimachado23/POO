package avaliacao2;
import java.time.LocalDateTime; 
import java.util.ArrayList;

public class OrderTester {
   public static void main(String[] args) {

    // criação de uma nova instância de OrderManager
    OrderManager ordermanager = new OrderManager();

    String filename = "pedidos.txt";
    ordermanager.readOrdersFromFile(filename);
    ordermanager.printAllOrders();

    // adicionar order
    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item("Arroz", 2.00));
    items.add(new Item("Peixe", 10.50));
    Order order = new Order(1, 12.00, "Loja 1", "Cliente 1", LocalDateTime.now());
    ordermanager.addOrder(order);

    // remover order
    ordermanager.removeOrder(1);

    // procurar order
    ordermanager.searchOrder(2);

    // calcular custo de order
    double orderCost = ordermanager.calculateOrderCost(2);
    System.out.println("Order cost: " + orderCost);

    // print de todas as orders
    ordermanager.printAllOrders();
    }
}
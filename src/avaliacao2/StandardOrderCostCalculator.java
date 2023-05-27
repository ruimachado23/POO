package avaliacao2;

public class StandardOrderCostCalculator implements OrderCostCalculator{
    public double calculateOrderCost(Order order){
        double total = 0;
        for(Item item : order.getItems()){
            total += item.getPrice();
        }
        
        if (order.isExpressedDelivery()) {
            total += total * 0.30;
        }

        return total;
    }
}
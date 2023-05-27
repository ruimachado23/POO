package avaliacao2;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private double price;
    private String storeId;
    private String clientId;
    private LocalDateTime orderDateTime;
    private List<Item> items;
    private boolean expressedDelivery;

    public Order(int id, double price, String storeId, String clientId, LocalDateTime orderDateTime) {
        this.id = id;
        this.price = price;
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isExpressedDelivery() {
        return expressedDelivery;
    }

    public void setExpressedDelivery(boolean expressedDelivery) {
        this.expressedDelivery = expressedDelivery;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", storeId='" + storeId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", orderDateTime=" + orderDateTime +
                '}';
    }

    public double TotalPrice() {
        return this.price;
    }
}

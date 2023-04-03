package aula05;

class Property {
    private static int id;
    private int rooms;
    private String location;
    private double price;
    private boolean available;
    private DateYMD auctionStartDate;
    private int auctionDurationDays;

    public Property(int id, String location, int rooms, double price) {
        id++;
        this.rooms = rooms;
        this.location = location;
        this.price = price;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public int getRooms() {
        return rooms;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void sell() {
        this.available = false;
    }

    public void setAuction(DateYMD startDate, int durationDays) {
        if (this.available){
            this.auctionStartDate = startDate;
            this.auctionDurationDays = durationDays;
        }
        else{
            System.out.println("Imóvel " + id + " não está disponível para leilão.");
        }
    }
    public String toString() {
        String status = available ? "disponível" : "vendido";
        String auctionInfo = "";
        if (auctionStartDate != null) {
            auctionInfo = " (leilão a partir de " + auctionStartDate.toString() + ", duração de " + auctionDurationDays + " dias)";
        }
        return "ID: " + id + ", Localização: " + location + ", Quartos: " + rooms + ", Preço: $" + price + ", Status: " + status + auctionInfo;
    }
}


package aula05;

public class ex03 {
    public static void main(String[] args) {
        RealEstate imobiliaria = new RealEstate();
        imobiliaria.newProperty(2, "Glória", 30000);
        imobiliaria.newProperty(1, "Vera Cruz", 25000);
        imobiliaria.newProperty(3, "Santa Joana", 32000);
        imobiliaria.newProperty(2, "Aradas", 24000);
        imobiliaria.newProperty(2, "São Bernardo", 20000);

        imobiliaria.sell(1001);
        imobiliaria.setAuction(1002, new DateYMD(21, 3, 2023), 4);
        imobiliaria.setAuction(1003, new DateYMD(1, 4, 2023), 3);
        imobiliaria.setAuction(1001, new DateYMD(1, 4, 2023), 4);
        imobiliaria.setAuction(1010, new DateYMD(1, 4, 2023), 4);

        System.out.println(imobiliaria);
    }

}

package aula08;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];
        veiculos[0] = new AutomovelLigeiro("11-AA-11", "Ford", "Fiesta", 100, 123456, 5);
        veiculos[1] = new Motociclo("22-BB-22", "Honda", "CBR", 100, "Deportiva");
        veiculos[2] = new Taxi("33-CC-33", "Ford", "Fiesta", 100, 123456, 5, 123456);
        Empresa empresa = new Empresa("Empresa", "1234-567", "ua@ua.pt", veiculos);

        System.out.println("Veículo 1: " + empresa.getVeiculos()[0].toString());
        System.out.println("Veículo 2: " + empresa.getVeiculos()[1].toString());
        System.out.println("Veículo 3: " + empresa.getVeiculos()[2].toString());

        System.out.println("Veículo 1 é igual ao veículo 2? " + empresa.getVeiculos()[0].equals(empresa.getVeiculos()[1]));
        System.out.println("Veículo 1 é igual ao veículo 3? " + empresa.getVeiculos()[0].equals(empresa.getVeiculos()[2]));
        System.out.println("Veículo 2 é igual ao veículo 3? " + empresa.getVeiculos()[1].equals(empresa.getVeiculos()[2]));
    }
}

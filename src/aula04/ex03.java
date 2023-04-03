package aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;
    }
}

public class ex03 {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        System.out.println("Carros registados: ");
        for (Car chn : cars){
            System.out.printf("%s %s, %d, kms: %d\n", chn.make, chn.model, chn.year, chn.kms);
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car ("Renault", "Magane Tourier", 2015, 36331);
        cars[1] = new Car ("Toyota", "Camry", 2010, 34880);
        cars[2] = new Car ("Mercedes", "Vito", 2008, 275407);

        listCars(cars);

        System.out.println("");

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            cars[j].drive(kms);
        }
        System.out.println("");
        listCars(cars);

        sc.close();

    }
}
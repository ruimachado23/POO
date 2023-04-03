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

public class ex04 {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        int numCars = 0;
        while (true) {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String line = sc.nextLine();
            if (line.isEmpty()){
                return numCars;
            }
            String[] parts = line.split(" ");
            String make = parts[0];
            String model = parts[1];
            String year = parts[2];
            String kms = parts[3];
            if (validarDadosEntrada(make, model, year, kms)) {
                int yearInt = Integer.parseInt(year);
                int kmsInt = Integer.parseInt(kms);
                cars[numCars] = new Car(make, model, yearInt, kmsInt);
                numCars++;
            } else {
                System.out.println("Dados mal formatados. Tente novamente");
            }
        }
    }

    public static boolean validarDadosEntrada(String make, String model, String year, String kms) {
        if (!make.matches("\\w+")) {
            return false;
        }  
        
        if (!model.matches("\\w+( \\w+)*")) {
            return false;
        }
        
        if (!year.matches("\\d{4}")) {
            return false;
        }
        
        if (!kms.matches("\\d+")) {
            return false;
        }
        
        return true;
    }    

    static void registerTrips(Car[] cars, int numCars) {
        System.out.println("");
        while (true) {
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String line = sc.nextLine();
            if (line.isEmpty()){
                return;
            }
            String[] parts = line.split(":");
            int car = Integer.parseInt(parts[0]);
            int distance = Integer.parseInt(parts[1]);
            if (car >= 0 && car < numCars && distance > 0) {
                cars[car].drive(distance);
            } else {
                System.out.println("Dados mal formatados. Tente novamente");
            }
        }
    }

    static void listCars(Car[] cars, int numCars) {
        System.out.println("\nCarros registados: ");
        for (int i = 0; i < numCars; i++) {
            System.out.println(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms: " + cars[i].kms);
        }
    }
    

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars, numCars);
            registerTrips(cars, numCars);
            listCars(cars, numCars);
        }

        sc.close();

    }
}

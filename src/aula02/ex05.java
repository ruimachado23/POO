package aula02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade no primeiro trajeto (km/h): "); 
        double v1 = sc.nextDouble();
        System.out.print("Velocidade no segundo trajeto (km/h): "); 
        double v2 = sc.nextDouble();
        System.out.print("Distância do primeiro trajeto (km): ");
        double d1 = sc.nextDouble();
        System.out.print("Distância do segundo trajeto (km): ");
        double d2 = sc.nextDouble();
        sc.close();
        
        if (v1 < 0 || v2 < 0|| d1 < 0 || d2 < 0){
            System.out.println("Erro! Os valores inseridos devem ser todos positivos");
        }
        else {
            double vf = (d1 + d2) / ((d1 / v1) + (d2 / v2));
            System.out.println("Velocidade média final: " + vf + "km/h");
        } 
    }
}
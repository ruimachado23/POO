package aula02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água(kg): ");

        double q = sc.nextDouble();
        System.out.print("Temperatura inicial(C): ");
        double i = sc.nextDouble();
        System.out.print("Temperatura final(C): ");
        double f = sc.nextDouble();

        double j = q * (f-i) * 4184;

        System.out.println("Energia(J): " + j);

        sc.close();

    }
}
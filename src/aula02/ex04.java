package aula02;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido: ");
        double m = sc.nextDouble();
        System.out.print("Taxa de juro mensal: ");
        double t = sc.nextDouble();
        for (int i = 0; i<3; i++){
            m += (m * t/100);
        }
        sc.close();
        System.out.print("O valor investido ao final de 3 meses é igual a " + m + " euros");



    }
}
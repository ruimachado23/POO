package aula02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
       
        int count = 1;
        double soma = n1;
        double max = n1;
        double min = n1;

        while(true){
            System.out.print("Digite um número: ");
            double n2 = sc.nextDouble();
            count++;
            soma += n2;

            if (n2 > max){
                max = n2;
            }

            if (min > n2){
                min = n2;
            }

            if (n1 == n2){
                break;
            }
        }

        double m = soma / count;
        System.out.println("Média: " + m);
        System.out.println("Total de valores lidos: " + count);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

        sc.close();

    }
}
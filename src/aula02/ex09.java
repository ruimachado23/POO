package aula02;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--){
            if (i % 10 == 0){
                System.out.println(i + ",");
            }else{
            System.out.print(i + ",");
            }
        }
        System.out.print("0");
        sc.close();
    }
}
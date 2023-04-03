package aula03extra;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        do {
            System.out.print("Insira uma string: ");
            string = sc.nextLine();
            if(string.equals("")) {
                System.out.println("A string está vazia\n");
            }
        } while (string.equals(""));

        String[] palavras = string.split(" ");

        String acronimo = "";

        for (String palavra : palavras) {
            if (palavra.length() >= 3) {
                acronimo += palavra.charAt(0);
            }
        }
        System.out.println("Acrónimo: " + acronimo.toUpperCase());
        sc.close();
    }
}

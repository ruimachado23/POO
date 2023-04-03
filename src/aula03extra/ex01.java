package aula03extra;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string;

        do {
            System.out.print("String: ");
            string = sc.nextLine();
            if (string.equals("")) {
                System.out.println("Não foi digitado nada, tente novamente!\n");
            }
        } while (string.equals(""));

        sc.close();

        System.out.println("\nMinúsculas: " + string.toLowerCase());
        System.out.println("Último caracter: " + string.charAt(string.length() - 1));
        System.out.println("Três primeiros caracters: " + string.substring(0,3));
        

    }
}

package aula03extra;

import java.util.Scanner;

public class ex02 {

    public static int countDigits(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean onlyLowCase(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return false;
            }
        }   
        return true;
    }

    public static boolean isPolindrom(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma string: ");
        String string = sc.nextLine();
        System.out.println("\nqA string tem " + countDigits(string) + " digitos");
        System.out.println("A string tem " + countSpaces(string) + " espaços");
        System.out.println("A string só tem letras minúsculas? " + onlyLowCase(string));
        System.out.println("A string é um polindromo? " + isPolindrom(string));
        sc.close();
    }
}


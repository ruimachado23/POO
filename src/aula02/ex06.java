package aula02;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo em segundos: ");
        int s = sc.nextInt();
        sc.close();

        int h = s / 3600;
        int m = (s % 3600) / 60;
        int sec = s % 60;

        System.out.printf("%02d:%02d:%02d", h, m, sec);    }
}
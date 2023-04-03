package aula02;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius(C): ");
        double c = sc.nextDouble();
        double f = 1.8 * c + 32;
        System.out.println("Farhrenheit(F): " + f);
        sc.close();
    }
}
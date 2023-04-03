package aula02;
import java.util.Scanner;
import utils.UserInput;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Distância(km): ");

        double km = sc.nextDouble();
        UserInput.positive(km);
        double ml = km / 1.609;

        System.out.println("Milhas: " + ml);

        sc.close();
    }
}
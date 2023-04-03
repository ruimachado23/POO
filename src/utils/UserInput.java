package utils;
import java.util.Scanner;

public class UserInput {

    public static void positive(double n) {
        if (n<=0) {
            System.out.println("The number must be positive!");
            System.exit(1);
        }
    }

    
    public static void numberInInterval(double max, double min) {
        double n;
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        n = sc.nextDouble();
        if (n < min || n > max) {
            System.out.print("Number out of range!");
            System.exit(1);
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }    
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

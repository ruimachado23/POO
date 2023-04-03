package aula02;

import java.util.Scanner;

public class ex08 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        double angulo;
        
        do {
            System.out.print("Digite o valor do cateto A: ");
            a = sc.nextDouble();
        } while (a <= 0);
        
        do {
            System.out.print("Digite o valor do cateto B: ");
            b = sc.nextDouble();
        } while (b <= 0);
        
        c = Math.sqrt(a*a + b*b);
        System.out.println("Valor da hipotenusa: " + c);
        
        angulo = Math.toDegrees(Math.atan(a/b));
        System.out.println("Ângulo entre A e a hipotenusa: " + angulo + " graus.");
        
        sc.close();
    }
}
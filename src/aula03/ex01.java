package aula03;
import java.util.Scanner;
import utils.UserInput;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = sc.nextInt();
            if (n <= 0){
                System.out.println("O número digitado é negativo!");
            }

        } while (n <= 0);  

        int soma = 0;
        for (int i = 2; i <= n; i++) {
            if (UserInput.isPrime(i)) {
                soma += i;
            }
        }
        System.out.println("A soma dos números primos até " + n + " é: " + soma);
        sc.close();
    }
}

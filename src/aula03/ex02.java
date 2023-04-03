package aula03;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m, tj;
        do {
            System.out.print("Montante investido (positivo e múltiplo de mil): ");
            m = sc.nextDouble();
            System.out.print("Taxa de juro mensal (0%-5%): ");
            tj = sc.nextDouble();
            if (m <= 0 || m % 1000 != 0 || tj <= 0 || tj > 5){
                System.out.println("Os valores inseridos não são válidos!");
            }
            
        } while (m <= 0 || m % 1000 != 0 || tj <= 0 || tj > 5); 
        
        double vm = m;

        for (int i = 1; i <= 12; i++ ){
            vm += vm * (tj / 100);
            System.out.printf("Valor mensal do mês %d = %.2f€\n", i, vm);
        }

        sc.close();
    }   

}

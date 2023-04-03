package aula03;
import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {

        String data;
        
        Scanner scanner = new Scanner(System.in); // move scanner declaration outside loop
    
        do {
            System.out.print("Digite a data no formato mm/yyyy: ");
            data = scanner.nextLine();
        } while (!validarData(data));
    
        int diaSemana;
    
        do {
            System.out.print("Digite o dia da semana em que começa o mês (1 a 7): ");
            diaSemana = scanner.nextInt();
        } while (diaSemana < 1 || diaSemana > 7);
    
        int mes = Integer.parseInt(data.substring(0, 2));
        int ano = Integer.parseInt(data.substring(3));
        int diasNoMes = calcularDiasNoMes(mes, ano);
    
        imprimirCalendario(diasNoMes, diaSemana);
    
        scanner.close(); 
    }
    
    
    public static boolean validarData(String data) {
        if (data.matches("\\d{2}/\\d{4}")) {
            int mes = Integer.parseInt(data.substring(0, 2));
            int ano = Integer.parseInt(data.substring(3));
            return mes >= 1 && mes <= 12 && ano >= 1;
        }
        return false;
    }
    
    public static int calcularDiasNoMes(int mes, int ano) {
        if (mes == 2 && ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)) {
            return 29;
        }
        int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasNoMes[mes];
    }
    
    public static void imprimirCalendario(int diasNoMes, int diaSemana) {
        System.out.println("Dom Seg Ter Qua Qui Sex Sab");
        for (int i = 1; i < diaSemana; i++) {
            System.out.print("    ");
        }
        for (int dia = 1; dia <= diasNoMes; dia++) {
            System.out.printf("%3d ", dia);
            if ((dia + diaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }
        if ((diasNoMes + diaSemana - 1) % 7 != 0) {
            System.out.println();
        }
    }
}

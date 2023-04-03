package aula03;
import java.util.Scanner;
import java.util.Random;

public class ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random gerador = new Random();

    int numeroAleatorio = gerador.nextInt(100) + 1;
    int tentativas = 0;
    String resposta;

    System.out.println("Bem-vindo ao jogo AltoBaixo!");
    System.out.println("Tente adivinhar um número entre 1 e 100.");

    do {
      System.out.print("Insira a sua tentativa: ");
      int tentativa = input.nextInt();
      tentativas++;

      if (tentativa < numeroAleatorio) {
        System.out.println("Tentativa muito baixa.");

      } else if (tentativa > numeroAleatorio) {
        System.out.println("Tentativa muito alta.");
        
      } else {
        System.out.println("Parabéns, você acertou em " + tentativas + " tentativas!");
        System.out.println("Pretende continuar? Prima (S)im.");
        resposta = input.next();
        if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("Sim")) {
          System.out.println("Obrigado por jogar!");
          break;
        } else {
          numeroAleatorio = gerador.nextInt(100) + 1;
          tentativas = 0;
        }
      }
    } while (true);
    input.close();
  }
  
}

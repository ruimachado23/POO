package aula03;
import java.util.Scanner;

public class ex04 {
    
    // função para calcular a nota final do aluno
    public static int calcularPauta(double notaT, double notaP) {
        if (notaT < 7.0 || notaP < 7.0) {
            return 66; // reprovado por nota mínima
        } else {
            return (int) Math.round(0.4 * notaT + 0.6 * notaP); // arredondado a unidades
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // pedir o número de alunos na turma
        System.out.print("Quantos alunos tem a turma? ");
        int numAlunos = input.nextInt();
        
        // criar vetor bidimensional para armazenar notas teóricas e práticas dos alunos
        double[][] notas = new double[numAlunos][2];
        
        // preencher o vetor com notas aleatórias entre 0.0 e 20.0, arredondadas às décimas
        for (int i = 0; i < numAlunos; i++) {
            notas[i][0] = Math.round(Math.random() * 200.0) / 10.0;
            notas[i][1] = Math.round(Math.random() * 200.0) / 10.0;
        }
        
        // imprimir cabeçalho da tabela
        System.out.printf("%6s %6s %6s\n", "NotaT", "NotaP", "Pauta");
        
        // imprimir notas e pautas de todos os alunos
        for (int i = 0; i < numAlunos; i++) {
            double notaT = notas[i][0];
            double notaP = notas[i][1];
            int pauta = calcularPauta(notaT, notaP);
            System.out.printf("%6.1f %6.1f %6d%n", notaT, notaP, pauta);
        }
        
        input.close();
    }
}

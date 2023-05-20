package aula12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class ex01 {
    public static void main(String[] args) {
        String filename = "major.txt";
        int count = 0;
        HashSet<String> set = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Percorre o array de palavras
                String[] palavras = linha.split("\\s+");
                for (int i = 0; i < palavras.length - 1; i++) {
                    count++;
                    set.add(palavras[i]);
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("Total de palavras: " + count);
        System.out.println("Total de palavras diferentes: " + set.size());
    }
}
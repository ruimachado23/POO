package aula11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*
 * Construa um programa que leia um ficheiro de texto e que conte todos os pares de palavras
    encontrados no ficheiro e o número de ocorrências de cada par. Despreze todas as palavras
    de tamanho inferior a 3 e considere como separadores os seguintes caracteres:
    \t\n.,:'‘’;?!-*{}=+&/()[]”“\"\'
 */

 public class ex01 {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        String filename = "major.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Remove os caracteres separadores da linha e divide as palavras em um array
                String[] palavras = linha.split("\\s+");

                // Percorre o array de palavras
                for (int i = 0; i < palavras.length - 1; i++) {
                    // Verifica se a palavra atual tem tamanho maior ou igual a 3
                    if (palavras[i].length() >= 3) {
                        // Cria um par com a palavra atual e a próxima palavra
                        String palavra1 = palavras[i];
                        String palavra2 = palavras[i+1];

                        if (isSeparador(palavra2)) {
                            palavra2 = "separador";
                        }
                        // Incrementa a contagem de ocorrências do par no mapa
                        if (map.containsKey(palavra1)) {
                            HashMap<String, Integer> innerMap = map.get(palavra1);
                            if (innerMap.containsKey(palavra2)) {
                                innerMap.put(palavra2, innerMap.get(palavra2) + 1);
                            } else {
                                innerMap.put(palavra2, 1);
                            }
                        } else {
                            HashMap<String, Integer> innerMap = new HashMap<>();
                            innerMap.put(palavra2, 1);
                            map.put(palavra1, innerMap);
                        }
                    } 
                }
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        for (String palavra1 : map.keySet()) {
            System.out.print(palavra1 + "={");
            HashMap<String, Integer> innerMap = map.get(palavra1);
            for (String palavra2 : innerMap.keySet()) {
                System.out.print(palavra2 + "=" + innerMap.get(palavra2) + ", ");
            }
            System.out.println("}");
        }
    }

    public static boolean isSeparador(String word) {
        if(word.matches("\\w*[\\t\\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"']\\w*")) {
            return true;
        }
        else {
            return false;
        }
    }
}

package aula10;
import java.util.HashMap;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma string: ");

        String string = sc.nextLine();

        HashMap<Character, String> charPositions = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (charPositions.containsKey(c)) {
                String positions = charPositions.get(c);
                positions += ", " + i;
                charPositions.put(c, positions);
            } else {
                charPositions.put(c, "[" + i);
            }
        }

        // Append "]" to each value in the map
        for (char c : charPositions.keySet()) {
            String positions = charPositions.get(c);
            positions += "]";
            charPositions.put(c, positions);
        }

        // Imprime os resultados
        System.out.println(charPositions);

        sc.close();
    }
}

package aula10;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static ArrayList<String> list= new ArrayList<String>();
    public static ArrayList<String> list2= new ArrayList<String>();
    public static ArrayList<String> list3= new ArrayList<String>();

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("texto.txt"));
        
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);

            if (word.length() > 2) {
                list.add(word);
            }

            if (word.endsWith("s")){
                list2.add(word);
            }

            if (word.matches("[a-zA-Z]+")){
                list3.add(word);
            }
        }

        System.out.println("\nTwo words list:");
        System.out.println(list);

        System.out.println("\nEnding with 's' words list:");
        System.out.println(list2);

        System.out.println("\nOnly letters words list:");
        System.out.println(list2);

        input.close();
    }
}

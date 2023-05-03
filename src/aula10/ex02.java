package aula10;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Random;

public class ex02 {
    public static TreeMap<String, Book> books2 = new TreeMap<>();

    public static void main(String[] args) {

        Book b1 = new Book("The Great Gatsby", "A. Scott Fitzgerald", 1921);
        Book b2 = new Book("The Bad Gatsby", "B. Scott Fitzgerald", 1922);
        Book b3 = new Book("The Overwhelming Gatsby", "C. Scott Fitzgerald", 1923);
        Book b4 = new Book("The Beauty Gatsby", "D. Scott Fitzgerald", 1924);
        Book b5 = new Book("The Big Gatsby", "E. Scott Fitzgerald", 1925);

        //change title from b1
        b1.setTitle("The Gatbsy");

        //add books
        books2.put("Drama", b1);
        books2.put("Terror", b2);
        books2.put("Ação", b3);
        books2.put("Aventura", b4);
        books2.put("Aventura", b5);

        //remove book
        books2.remove("Drama");

        //print all 
        System.out.println("List:");
        System.out.println(books2);

        //print all generos
        System.out.println("\nGéneros:");
        System.out.println(books2.keySet());

        //print all books
        System.out.println("\nBooks:");
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        
        // Teste do método selectRandomBookByGenre
        String genre = "Aventura";
        Book randomBook = selectRandomBookByGenre(genre);

        if (randomBook != null) {
            System.out.println("\nLivro aleatório do gênero " + genre + ":");
            System.out.println(randomBook);
        } else {
            System.out.println("\nNão há livros no gênero " + genre);
        }
    }

    public static Book selectRandomBookByGenre(String genre) {
        ArrayList<Book> booksByGenre = new ArrayList<>(books2.subMap(genre, genre + Character.MAX_VALUE).values());
        
        Random random = new Random();
        int randomIndex = random.nextInt(booksByGenre.size());
        
        return booksByGenre.get(randomIndex);
    }
    
}

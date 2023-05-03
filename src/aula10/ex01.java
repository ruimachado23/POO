package aula10;
import java.util.HashMap;
import java.util.Map;

public class ex01 {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();

        Book b1 = new Book("The Great Gatsby", "A. Scott Fitzgerald", 1921);
        Book b2 = new Book("The Bad Gatsby", "B. Scott Fitzgerald", 1922);
        Book b3 = new Book("The Overwhelming Gatsby", "C. Scott Fitzgerald", 1923);
        Book b4 = new Book("The Beauty Gatsby", "D. Scott Fitzgerald", 1924);
        Book b5 = new Book("The Big Gatsby", "E. Scott Fitzgerald", 1925);

        //change title from b1
        b1.setTitle("The Gatbsy");

        //add books
        books.put("Drama", b1);
        books.put("Terror", b2);
        books.put("Ação", b3);
        books.put("Aventura", b4);
        books.put("Romance", b5);

        //remove book
        books.remove("Drama");

        //print all 
        System.out.println("List:");
        System.out.println(books);

        //print all generos
        System.out.println("\nGéneros:");
        System.out.println(books.keySet());

        //print all books
        System.out.println("\nBooks:");
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}

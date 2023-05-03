package aula10;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title  = title;
        this.author = author;
        this.year   = year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", this.title, this.author, this.year);
    }
}

package FirstProject;
import java.lang.*;

public class Books {
    private int readBooks;
    private String booksNames;

    public Books(String b, int r) {
        booksNames = b;
        readBooks = r;
    }

    public Books(String b) {
        booksNames = b;
        readBooks = 0 ;
    }

    public Books() {
        booksNames = "Secrets of the world";
        readBooks  = 0 ;
    }

    public void setReadBooks(int readBooks) {
        this.readBooks = readBooks;
    }

    public void setBooksNames(String booksNames) {
        this.booksNames = booksNames;
    }

    public int getReadBooks() {
        return readBooks;
    }

    public String getBooksNames() {
        return booksNames;
    }

    public String toString() {
        return this.booksNames+", read "+ this.readBooks;
    }

    public void visitsPerWeek() {
        System.out.println('"' + booksNames + '"' + " read " + readBooks + " times a week");
    }
}

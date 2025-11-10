import java.util.*;

class Book {
    int bookID;
    String bookName;
    String author;
    String publisher;
    int quantity;

    Book(int bookID, String bookName, String author, String publisher, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {
        return "BookID: " + bookID + ", Name: " + bookName + ", Author: " + author +
               ", Publisher: " + publisher + ", Quantity: " + quantity;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book(101, "Java Programming", "James Gosling", "Sun Microsystems", 10));
        bookList.add(new Book(102, "Effective Java", "Joshua Bloch", "Pearson", 5));
        bookList.add(new Book(103, "Clean Code", "Robert C. Martin", "Prentice Hall", 7));
        bookList.add(new Book(104, "Head First Java", "Kathy Sierra", "O'Reilly", 12));

        System.out.println("Size of ArrayList: " + bookList.size());

        System.out.println("\nAll Books:");
        for (Book b : bookList) {
            System.out.println(b);
        }

        System.out.println("\nRemoving one book (BookID 102: Effective Java)...");
        bookList.remove(1); 

        
        System.out.println("\nBooks after removal:");
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}

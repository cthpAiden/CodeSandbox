
package schema;

import java.util.Scanner;


public class Book {
    private String bookID;
    private String bookName;
    private String author;
    private String publicationYear;
    private int quantity;
    public static Scanner sc = new Scanner(System.in);

    public Book() {
    }

    public Book(String bookID, String bookName, String author, String publicationYear, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void inputInfor() {
        System.out.print("Enter book ID: ");
        bookID = sc.nextLine();
        System.out.print("Enter book name: ");
        bookName = sc.nextLine();
        System.out.print("Enter author: ");
        author = sc.nextLine();
        System.out.print("Enter publication year: ");
        publicationYear = sc.nextLine();
        while (true) {
            System.out.print("Enter quantity: ");
            try {
                quantity = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Must be an integer!");
            }
        }
        
    }
    
    public String getThongTinChiTiet() {
        return "Book";
    }
    
    public static void showHeader() {
        System.out.println("-------------------------------------------");
        System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-8s|%-35s|%n",
                "Book ID", "Book Name", "Author", "Year", "Quantity", "Details");
    }
    
    public void showInfor() {
        System.out.printf("|%-10s|%-20s|%-20s|%-10s|%-8d|%-35s|%n",
                bookID, bookName, author, publicationYear, quantity, getThongTinChiTiet());
    }
    
    @Override
    public String toString() {
        return String.format("Book [ID = %s, Name = %s, Author = %s, Year = %s, Quantity = %d]",
                bookID, bookName, author, publicationYear, quantity);
    }
    
    
}

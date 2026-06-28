
package data;

import java.util.Scanner;


public abstract class Book {
    public static Scanner sc = new Scanner(System.in);
    protected String id;
    protected String title;
    protected String author;
    protected int borrowDays;
    protected double dailyLateFee;

    public Book() {
    }

    public Book(String id, String title, String author, int borrowDays, double dailyLateFee) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowDays = borrowDays;
        this.dailyLateFee = dailyLateFee;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBorrowDays() {
        return borrowDays;
    }

    public void setBorrowDays(int borrowDays) {
        this.borrowDays = borrowDays;
    }

    public double getDailyLateFee() {
        return dailyLateFee;
    }

    public void setDailyLateFee(double dailyLateFee) {
        this.dailyLateFee = dailyLateFee;
    }
    
    
    public void display() {
        System.out.printf("| %-10s | %-10s | %-10s | %-10d | %-10.2f |\n", 
                id, title, author, borrowDays, dailyLateFee);
    }
    
    public void input() {
        System.out.print("Enter ID:");
        id = sc.nextLine();
        System.out.print("Enter title:");
        title = sc.nextLine();
        System.out.print("Enter author:");
        author = sc.nextLine();
        
        while (true) {
            System.out.print("Enter borrowDays: ");
            try {
                borrowDays = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        
        while (true) {
            System.out.print("Enter dailyLateFee: ");
            try {
                dailyLateFee = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }        
    }
    
    public abstract double calculateLateFee(int daysOverdue);
    
    public abstract String getCategory();
    
    
}

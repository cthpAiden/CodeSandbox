package manager;

import data.Book;
import data.FictionBook;
import data.TextBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    List<Book> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mng = new Manager();
        int choice = 1;
        do {
            mng.menu();
            choice = readInt(sc, "Enter your choice: ");
            switch (choice) {
                case 1:
                    mng.addFictionBook();
                    break;
                case 2:
                    mng.addTextBook();
                    break;
                case 3:
                    mng.displayAll();
                    break;
                case 4:
                    mng.searchById();
                    break;
                case 5:
                    mng.removeById();
                    break;
                case 6:
                    mng.calculateFee();
                    break;
                case 7:
                    mng.displayLateBooksNDays();
                    break;
                case 8:
                    mng.sortByTitleAsc();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong input");
                    break;

            }
        } while (choice != 0);
    }

    public void addFictionBook() {
        FictionBook fb = new FictionBook();
        System.out.println("===== ADDING BOOK =====");
        fb.input();
        list.add(fb);
    }

    public void addTextBook() {
        TextBook tb = new TextBook();
        System.out.println("===== ADDING BOOK =====");
        tb.input();
        list.add(tb);
    }

    public void displayAll() {
        for (Book book : list) {
            book.display();
        }
    }

    public void searchById() {
        System.out.print("Enter ID to search: ");
        String id = Book.sc.nextLine().trim();
        boolean found = false;
        for (Book book : list) {
            if (book.getId().equalsIgnoreCase(id)) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with ID: " + id);
        }
    }

    public void removeById() {
        System.out.print("Enter ID to remove: ");
        String id = Book.sc.nextLine().trim();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(id)) {
                list.remove(i);
                System.out.println("Book removed!");
                return;
            }
        }
        System.out.println("No book found with ID : " + id);
    }

    public void calculateFee() {
        System.out.print("Enter ID: ");
        String id = Book.sc.nextLine();
        int daysOverdue = readInt(Book.sc, "Enter days overdue: ");
        for (Book book : list) {
            if (book.getId().equalsIgnoreCase(id)) {
                System.out.printf("Late fee for \"%s\": $%.2f%n", book.getTitle(), book.calculateLateFee(daysOverdue));
                return;
            }
        }
        System.out.println("No book found with ID: " + id);
    }

    public void displayLateBooksNDays() {
        int overdueDays = readInt(Book.sc, "Enter day(s): ");
        boolean found = false;
        for (Book book : list) {
            if (book.getBorrowDays() > overdueDays) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book with borrow days over " + overdueDays + ".");
        }
    }

    public void sortByTitleAsc() {
        list.sort((a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
        System.out.println("Sorted by title (A-Z):");
        displayAll();
    }

    public void menu() {
        System.out.println("===== LIBRARY MANAGEMENT =====");
        System.out.println("1. Add Fiction Book");
        System.out.println("2. Add Textbook");
        System.out.println("3. Display all books:");
        System.out.println("4. Search by ID");
        System.out.println("5. Remove by ID");
        System.out.println("6. Calculate fee for a book (enter ID + days overdue)");
        System.out.println("7. Display books with overdue > N days (user inputs N)");
        System.out.println("8. Sort by title (A-Z)");
        System.out.println("0. Exit");
    }

    public static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Wrong input, try again!");
            }
        }
    }

}

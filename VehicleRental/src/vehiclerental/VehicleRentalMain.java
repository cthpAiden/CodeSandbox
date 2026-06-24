package vehiclerental;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Vehicle Rental Management - single-file practice skeleton.
 * Fill in every // TODO hole. Signatures and structure are given.
 *
 * Concepts practiced: inheritance, @Override, polymorphism (call via parent
 * reference), instanceof filtering, lambda comparator sort, try/catch input
 * validation, console menu.
 */
public class VehicleRentalMain {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();
        shop.run();
    }
}

/* =========================================================
 * PARENT CLASS
 * ========================================================= */
abstract class Vehicle {
    private String id;
    private String name;
    private int rentalDays;
    private double baseDailyRate;

    public Vehicle(String id, String name, int rentalDays, double baseDailyRate) {
        this.id = id;
        this.name = name;
        this.rentalDays = rentalDays;
        this.baseDailyRate = baseDailyRate;
    }
  

    // Getters / setters
    public String getId() { /* TODO */ return null; }
    public String getName() { /* TODO */ return null; }
    public int getRentalDays() { /* TODO */ return 0; }
    public double getBaseDailyRate() { /* TODO */ return 0; }

    public void setRentalDays(int rentalDays) { /* TODO */ }

    /**
     * Each subclass computes the fee with its own rules.
     * See the exercise pseudocode for the formula.
     */
    public abstract double calculateRentalFee();

    /** Category label, e.g. "Car" or "Motorbike". */
    public abstract String getType();

    @Override
    public String toString() {
        // TODO: return a one-line summary, e.g.
        // "[Car] id=C01 | Toyota Vios | 5 day(s) | fee=...";
        return null;
    }
}

/* =========================================================
 * CHILD CLASS 1
 * ========================================================= */
class Car extends Vehicle {
    private int seats;
    private boolean hasDriver;

    public Car(String id, String name, int rentalDays, double baseDailyRate,
               int seats, boolean hasDriver) {
        // TODO: call super(...) then assign seats, hasDriver
    }

    public int getSeats() { /* TODO */ return 0; }
    public boolean isHasDriver() { /* TODO */ return false; }

    @Override
    public double calculateRentalFee() {
        // TODO formula:
        // fee = baseDailyRate * rentalDays
        // if seats >= 7:        fee += fee * 0.15
        // if hasDriver:         fee += 300 * rentalDays
        // if rentalDays >= 7:   fee -= fee * 0.10
        // return fee
        return 0;
    }

    @Override
    public String getType() {
        // TODO: return "Car"
        return null;
    }
}

/* =========================================================
 * CHILD CLASS 2
 * ========================================================= */
class Motorbike extends Vehicle {
    private boolean isElectric;
    private int engineCc;

    public Motorbike(String id, String name, int rentalDays, double baseDailyRate,
                     boolean isElectric, int engineCc) {
        // TODO: call super(...) then assign isElectric, engineCc
    }

    public boolean isElectric() { /* TODO */ return false; }
    public int getEngineCc() { /* TODO */ return 0; }

    @Override
    public double calculateRentalFee() {
        // TODO formula:
        // fee = baseDailyRate * rentalDays
        // if isElectric:           fee -= fee * 0.20
        // else if engineCc > 150:  fee += fee * 0.10
        // if rentalDays >= 30:     fee -= fee * 0.25
        // return fee
        return 0;
    }

    @Override
    public String getType() {
        // TODO: return "Motorbike"
        return null;
    }
}

/* =========================================================
 * MANAGER CLASS (menu)
 * ========================================================= */
class RentalShop {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        int choice = -1;
        do {
            printMenu();
            choice = readInt("Choose: ");
            switch (choice) {
                case 1: addVehicle(); break;
                case 2: displayAll(); break;
                case 3: filterByType(); break;
                case 4: totalRevenue(); break;
                case 5: searchByName(); break;
                case 6: findMostExpensive(); break;
                case 7: sortByFeeDesc(); break;
                case 8: deleteByIndex(); break;
                case 0: System.out.println("Bye."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    private void printMenu() {
        System.out.println("\n===== RENTAL SHOP =====");
        System.out.println("1. Add vehicle");
        System.out.println("2. Display all");
        System.out.println("3. Filter by type");
        System.out.println("4. Total expected revenue");
        System.out.println("5. Search by name");
        System.out.println("6. Find most expensive rental");
        System.out.println("7. Sort by fee (descending)");
        System.out.println("8. Delete by index");
        System.out.println("0. Exit");
    }

    // ---- case 1 ----
    private void addVehicle() {
        // TODO:
        // 1. ask type: 1 = Car, 2 = Motorbike
        // 2. read shared fields (id, name, rentalDays, baseDailyRate) with validation
        // 3. read subclass-specific fields
        // 4. create the object and add to vehicles
    }

    // ---- case 2 ----
    private void displayAll() {
        // TODO: if empty print a message; else loop and print each Vehicle
        // (polymorphic toString()/calculateRentalFee())
    }

    // ---- case 3 ----
    private void filterByType() {
        // TODO: ask Car or Motorbike, loop and print only matching
        // ones using instanceof
    }

    // ---- case 4 ----
    private void totalRevenue() {
        // TODO: sum calculateRentalFee() over all vehicles, print total
    }

    // ---- case 5 ----
    private void searchByName() {
        // TODO: read keyword, print vehicles whose name contains it
        // (case-insensitive)
    }

    // ---- case 6 ----
    private void findMostExpensive() {
        // TODO: find vehicle with max calculateRentalFee(), print it
        // (handle empty list)
    }

    // ---- case 7 ----
    private void sortByFeeDesc() {
        // TODO: vehicles.sort( lambda comparator, fee descending );
        // then displayAll();
    }

    // ---- case 8 ----
    private void deleteByIndex() {
        // TODO: show indexes, read index, validate range, remove
    }

    /* ---------- input helpers ---------- */

    private int readInt(String prompt) {
        // TODO: loop with try/catch (NumberFormatException) until valid int
        return 0;
    }

    private double readPositiveDouble(String prompt) {
        // TODO: loop until value > 0, catch NumberFormatException
        return 0;
    }

    private boolean readYesNo(String prompt) {
        // TODO: read y/n -> true/false
        return false;
    }

    private String readNonEmpty(String prompt) {
        // TODO: loop until a non-blank line is entered
        return null;
    }
}

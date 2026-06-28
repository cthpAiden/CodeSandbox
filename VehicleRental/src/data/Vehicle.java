package data;

import static Manager.Manager.readDouble;
import static Manager.Manager.readInt;
import java.util.Scanner;

public abstract class Vehicle {
    protected String id;
    protected String name;
    protected int rentalDays;
    protected double baseDailyRate;
    public static Scanner sc = new Scanner(System.in);

    public Vehicle() {}

    public Vehicle(String id, String name, int rentalDays, double baseDailyRate) {
        this.id = id;
        this.name = name;
        this.rentalDays = rentalDays;
        this.baseDailyRate = baseDailyRate;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRentalDays() { return rentalDays; }
    public void setRentalDays(int rentalDays) { this.rentalDays = rentalDays; }
    public double getBaseDailyRate() { return baseDailyRate; }
    public void setBaseDailyRate(double baseDailyRate) { this.baseDailyRate = baseDailyRate; }

    public void input() {
        System.out.print("Enter ID: ");
        id = sc.nextLine().trim();
        System.out.print("Enter Name: ");
        name = sc.nextLine().trim();
        rentalDays = readInt(sc, "Enter rental days: ");
        baseDailyRate = readDouble(sc, "Enter base daily rate ($): ");
    }

    public abstract double calculateRentalFee();
    public abstract String getType();

    public void display() {
        System.out.printf("| %-6s | %-8s | %-15s | %4d days | $%8.2f/day | Fee: $%10.2f |%n",
                getType(), id, name, rentalDays, baseDailyRate, calculateRentalFee());
    }
}

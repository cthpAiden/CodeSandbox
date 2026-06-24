
package data;

import static Manager.Manager.readDouble;
import static Manager.Manager.readInt;
import java.util.Scanner;

public class Vehicle {
    protected String id;
    protected String name;
    protected int rentalDays;
    protected double baseDailyRate;
    public static Scanner sc = new Scanner(System.in);
    public Vehicle() {
    }

    public Vehicle(String id, String name, int rentalDays, double baseDailyRate) {
        this.id = id;
        this.name = name;
        this.rentalDays = rentalDays;
        this.baseDailyRate = baseDailyRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getBaseDailyRate() {
        return baseDailyRate;
    }

    public void setBaseDailyRate(double baseDailyRate) {
        this.baseDailyRate = baseDailyRate;
    }
        
    
    public void input() {
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        rentalDays = readInt(sc ,"Enter rental days: ");
        baseDailyRate = readDouble(sc, "Enter base daily rate: ");
    }
    
    public void display() {
        System.out.printf("|%-10s|%-10s|%-10d|%-10.2f|\n", id, name, rentalDays, baseDailyRate);
    }
    
    public double calculateRentalFee() { return 0;}
    
    public String getType() {
        
    }
}
 


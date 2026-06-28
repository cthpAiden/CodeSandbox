package Manager;

import data.Car;
import data.Motorbike;
import data.Vehicle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {

    List<Vehicle> list = new ArrayList<>();

    public static void main(String[] args) {
        Manager mng = new Manager();
        mng.run();
    }

    public void run() {
        Scanner sc = Vehicle.sc;
        while (true) {
            System.out.println("\n=== VEHICLE RENTAL MANAGEMENT ===");
            System.out.println("1. Add Car");
            System.out.println("2. Add Motorbike");
            System.out.println("3. Display all vehicles");
            System.out.println("4. Search by ID");
            System.out.println("5. Remove by ID");
            System.out.println("6. Total rental fee");
            System.out.println("7. Sort by rental fee (ascending)");
            System.out.println("0. Exit");
            int choice;
            try {
                choice = readInt(sc, "Your choice: ");
            } catch (Exception e) {
                System.out.println("Invalid choice.");
                continue;
            }
            switch (choice) {
                case 1 -> addVehicle(new Car());
                case 2 -> addVehicle(new Motorbike());
                case 3 -> displayAll();
                case 4 -> searchById(sc);
                case 5 -> removeById(sc);
                case 6 -> printTotalFee();
                case 7 -> sortByFee();
                case 0 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addVehicle(Vehicle v) {
        v.input();
        list.add(v);
        System.out.println("Vehicle added successfully.");
    }

    private void displayAll() {
        if (list.isEmpty()) {
            System.out.println("No vehicles in the list.");
            return;
        }
        System.out.println();
        for (Vehicle v : list) v.display();
    }

    private void searchById(Scanner sc) {
        System.out.print("Enter ID to search: ");
        String id = sc.nextLine().trim();
        boolean found = false;
        for (Vehicle v : list) {
            if (v.getId().equalsIgnoreCase(id)) {
                v.display();
                found = true;
            }
        }
        if (!found) System.out.println("No vehicle found with ID: " + id);
    }

    private void removeById(Scanner sc) {
        System.out.print("Enter ID to remove: ");
        String id = sc.nextLine().trim();
        boolean removed = list.removeIf(v -> v.getId().equalsIgnoreCase(id));
        System.out.println(removed ? "Removed successfully." : "No vehicle found with ID: " + id);
    }

    private void printTotalFee() {
        double total = list.stream().mapToDouble(Vehicle::calculateRentalFee).sum();
        System.out.printf("Total rental fee for all vehicles: $%.2f%n", total);
    }

    private void sortByFee() {
        list.sort(Comparator.comparingDouble(Vehicle::calculateRentalFee));
        System.out.println("Sorted by rental fee (ascending):");
        displayAll();
    }

    public static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Wrong input, enter a whole number.");
            }
        }
    }

    public static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Wrong input, enter numbers.");
            }
        }
    }
}

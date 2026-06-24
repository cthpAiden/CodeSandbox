package Manager;

import data.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {

    List<Vehicle> list = new ArrayList<>();

    public static void main(String[] args) {
        Manager mng = new Manager();
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

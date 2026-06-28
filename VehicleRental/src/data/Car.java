package data;

public class Car extends Vehicle {
    private int numSeats;

    public Car() {}

    public Car(String id, String name, int rentalDays, double baseDailyRate, int numSeats) {
        super(id, name, rentalDays, baseDailyRate);
        this.numSeats = numSeats;
    }

    public int getNumSeats() { return numSeats; }
    public void setNumSeats(int numSeats) { this.numSeats = numSeats; }

    @Override
    public void input() {
        super.input();
        numSeats = readInt(sc, "Enter number of seats: ");
    }

    @Override
    public double calculateRentalFee() {
        // Cars with more than 4 seats incur a 20% surcharge
        double multiplier = numSeats > 4 ? 1.2 : 1.0;
        return baseDailyRate * rentalDays * multiplier;
    }

    @Override
    public String getType() { return "Car"; }

    @Override
    public void display() {
        System.out.printf("| %-8s | %-6s | %-15s | %4d days | $%8.2f/day | %2d seats | Fee: $%10.2f |%n",
                getType(), id, name, rentalDays, baseDailyRate, numSeats, calculateRentalFee());
    }
}

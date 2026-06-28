package data;

public class Motorbike extends Vehicle {
    private int engineCC;

    public Motorbike() {}

    public Motorbike(String id, String name, int rentalDays, double baseDailyRate, int engineCC) {
        super(id, name, rentalDays, baseDailyRate);
        this.engineCC = engineCC;
    }

    public int getEngineCC() { return engineCC; }
    public void setEngineCC(int engineCC) { this.engineCC = engineCC; }

    @Override
    public void input() {
        super.input();
        engineCC = readInt(sc, "Enter engine capacity (cc): ");
    }

    @Override
    public double calculateRentalFee() {
        // High-displacement bikes (> 150cc) incur a 15% surcharge
        double multiplier = engineCC > 150 ? 1.15 : 1.0;
        return baseDailyRate * rentalDays * multiplier;
    }

    @Override
    public String getType() { return "Motorbike"; }

    @Override
    public void display() {
        System.out.printf("| %-8s | %-6s | %-15s | %4d days | $%8.2f/day | %4dcc    | Fee: $%10.2f |%n",
                getType(), id, name, rentalDays, baseDailyRate, engineCC, calculateRentalFee());
    }
}

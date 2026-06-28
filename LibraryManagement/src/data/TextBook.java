package data;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, String author, int borrowDays, double dailyLateFee, String subject) {
        super(id, title, author, borrowDays, dailyLateFee);
        this.subject = subject;
    }

    @Override
    public String getCategory() {
        return subject;
    }

    @Override
    public void display() {
        System.out.printf("| %-10s | %-10s | %-10s | %-10d | %-10.2f | %-10s |\n",
                id, title, author, borrowDays, dailyLateFee, subject);
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }

    @Override
    public double calculateLateFee(int daysOverdue) {
        return dailyLateFee * daysOverdue * 1.5;
    }
}

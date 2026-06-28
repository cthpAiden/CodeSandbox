
package data;


public class FictionBook extends Book {
    private String genre;

    public FictionBook() {
    }

    public FictionBook(String id, String title, String author, int borrowDays, double dailyLateFee, String genre) {
        super(id, title, author, borrowDays, dailyLateFee);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override
    public void display() {
        System.out.printf("| %-10s | %-10s | %-10s | %-10d | %-10.2f | %-10s |\n", 
                id, title, author, borrowDays, dailyLateFee, genre);
    }
    
    @Override 
    public void input() {
        super.input();
        System.out.print("Enter genre: ");
        genre = sc.nextLine();
    }
    
    @Override
    public double calculateLateFee(int daysOverdue) {
         return dailyLateFee * daysOverdue;        
    }
    
    @Override
    public String getCategory() {
        return genre;
    }
    
    
}


package schema;


public class Textbook extends Book {
    private String subject;

    public Textbook() {
    }

    public Textbook(String bookID, String bookName, String author, String publicationYear, int quantity, String subject) {
        super(bookID, bookName, author, publicationYear, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }
    
    @Override
    public String getThongTinChiTiet() {
        return "Textbook | Subject: " +subject; 
    }
    
}

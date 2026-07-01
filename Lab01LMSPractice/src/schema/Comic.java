
package schema;


public class Comic extends Book {
    private int issueNumber;

    public Comic() {
    }


    public Comic(String bookID, String bookName, String author, String publicationYear, int quantity, int issueNumber) {
        super(bookID, bookName, author, publicationYear, quantity);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    
    @Override 
    public void inputInfor() {
        super.inputInfor();
        while (true) {
                System.out.print("Enter issue number: ");
            try {
                issueNumber = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Must be an integer!");
            }
        }
    }
    
    @Override 
    public String getThongTinChiTiet() {
        return "Comic | Issue number: " +issueNumber;
    }
}

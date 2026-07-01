
package schema;


public class Others extends Book {
    private String note;

    public Others() {
    }


    public Others(String bookID, String bookName, String author, String publicationYear, int quantity, String note) {
        super(bookID, bookName, author, publicationYear, quantity);
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.print("Enter note: ");
        note = sc.nextLine();
    }
    
    @Override
    public String getThongTinChiTiet() {
        return "Others | Note: " +note; 
    }
    
    
}

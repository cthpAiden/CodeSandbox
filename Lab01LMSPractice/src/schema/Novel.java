package schema;

public class Novel extends Book {

    private String genre;

    public Novel() {
    }

    public Novel(String bookID, String bookName, String author, String publicationYear, int quantity, String genre) {
        super(bookID, bookName, author, publicationYear, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.print("Enter genre: ");
        genre = sc.nextLine();
    }
    
    @Override
    public String getThongTinChiTiet() {
        return "Novel | Genre: " +genre; 
    }
}

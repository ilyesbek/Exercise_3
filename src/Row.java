import java.util.ArrayList;

public class Row {
    private int rowID;
    private ArrayList<String> booksISBN;


    public Row(int rowID){
        this.rowID = rowID;
        this.booksISBN = new ArrayList<String>();
    }

    public int getRowID() {
        return rowID;
    }


    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public ArrayList<String> getBooks(){
        return booksISBN;
    }

    public void addBook(String isbn) {
        this.booksISBN.add(isbn);
    }
}

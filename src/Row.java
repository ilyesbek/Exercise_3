import java.util.ArrayList;

public class Row {
    private int rowID;
    private ArrayList<Integer> booksISBN;


    public Row(int rowID){
        this.rowID = rowID;
        this.booksISBN = new ArrayList<>();
    }

    public int getRowID() {
        return rowID;
    }


    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public ArrayList<Integer> getBooks(){
        return booksISBN;
    }
}

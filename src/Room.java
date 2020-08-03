import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private ArrayList<Row> rowsList;


    public Room(int roomNumber){
        this.roomNumber = roomNumber;
        this.rowsList = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Row> getRows(){
        return rowsList;
    }

    public Row getRowById(int rowID){
        for(Row row : rowsList){
            if(rowID == row.getRowID()){
                return row;
            }
        }
        Row row = new Row(rowID);
        rowsList.add(row);
        return row;
    }
}

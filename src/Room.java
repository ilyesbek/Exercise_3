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
}

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> bookList;
    private ArrayList<Room> roomList;


    //Constructor
    public Library() {
        this.bookList = new ArrayList<>();
        this.roomList = new ArrayList<>();

    }

    //Method for adding the books
    public void addBook(Book book, int roomNumber, int rowID){
        this.bookList.add(book);
        this.getRoomByID(roomNumber).getRowById(rowID).addBook(book.getIsbn());


    }


    //Method for displaying the books
    public void displayBooks(){
        for(Book book:bookList){
            book.display();
        }
    }
    //Method to locate books by their ISBN
    public Book getBookByISBN(String isbn) {
        for(Book book:bookList) {
            if (isbn.equals(book.getIsbn())) {
                return book;
            }
        }
        return null;
    }

    //Method to locate rooms by their ID
    public Room getRoomByID(int roomNumber){
        for(Room room : roomList){
            if(roomNumber == room.getRoomNumber()){
                return room;
            }
        }
        Room room = new Room(roomNumber);
        roomList.add(room);
        return room;

    }

    //Method to get the book from the room
    public boolean getAllBooksInRoom(int roomNumber) {
        ArrayList<String> foundList = new ArrayList<>();
        Room room = getRoomByID(roomNumber);
        for (Row row : room.getRows()) {
            return foundList.addAll(row.getBooks());
        }
        return false;
    }

    //Method to get the book by row
    public ArrayList<String> getAllBooksInRow(int room, int row) {
        return  getRoomByID(room).getRowById(row).getBooks();
    }



   public static void main(String[] args) {

        try{

            Library library = new Library();

            library.addBook(new Book("9780735211308", "James Clear", "Atomic Habits", "Penguin Random House LLC", 2018));
            library.addBook(new Book("9781455586660", "Cal Newport", "Deep Work: Rules for Focused Success in a Distracted World", "Grand Central Publishing", 2016));
            library.addBook(new Book("9781119552239", "Emily Freeman", "DevOps For Dummies","John Wiley & Sons, Inc.", 2019));

            System.out.println("Read " + library.bookList.size() + " books");
            library.displayBooks();






        } catch (Exception e) {
            e.printStackTrace();
        }


   }




}

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    //Constructor
    public Library() {
        this.bookList = new ArrayList<>();
    }

    //Method for adding the books
    public void addBook(Book book){
        this.bookList.add(book);
    }

    //Method for displaying the books
    public void displayBooks(){
        for(Book book:bookList){
            book.display();
        }
    }

    public void getBookByISBN() {

    }


    public void getAllBooksInRoom() {

    }

    public void getAllBooksInRow() {

    }



   public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("9780735211308", "James Clear", "Atomic Habits", "Penguin Random House LLC", 2018));
        library.addBook(new Book("9781455586660", "Cal Newport", "Deep Work: Rules for Focused Success in a Distracted World", "Grand Central Publishing", 2016));
        library.addBook(new Book("9781119552239", "Emily Freeman", "DevOps For Dummies","John Wiley & Sons, Inc.", 2019));
        System.out.println("Read " + library.bookList.size() + " books");
        library.displayBooks();


   }




}
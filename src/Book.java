public class Book {
    private String isbn;
    private String author;
    private String title;
    private String publisher;
    private int publicationYear;

    //Constructor
    public Book(String isbn, String author,String title, String publisher, int publicationYear)
    {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }



    //Displaying the books
    public void display() {
        System.out.println("ISBN: "+isbn);
        System.out.println("Author: "+author);
        System.out.println("Title: "+title);
        System.out.println("Publisher: "+publisher);
        System.out.println("Publication Year: "+publicationYear);
        System.out.println();


    }


}

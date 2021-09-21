


// Book is-a Publication
// but a more specific Publication
public class Book extends Publication {
    // Book is a Publication plus an author state
    // not all Publications have authors, but Books do
    protected String author;

    // DVC
    public Book() {
        // implicilty the Publication DVC is being called "here"
        // we can explictly call a super class constructor
        super(); // optional, invokes Publication DVC
        // call to super class constructor must be the first line
        // then initialize Book specific fields
        author = "BLANK AUTHOR";
    }

    // EVC #1
    public Book(String author) {
        super(); // optinal, DVC
        this.author = author;
    }

    // EVC #2
    public Book(String title, String publisher, int numPages, double price, String author) {
        super(title, publisher, numPages, price); // Publication's EVC
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author;
    }

    @Override
    public String generateCopyright() {
        return "TODO: to be implemented by Book";
    }
}

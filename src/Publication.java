
// inheritance: a relationship between 2 classes where one
// class includes (AKA inherits) the state AND behavior
// of the other class
// abstact means a class cannot be instantiated
// Publication is too "general" to instantiated
// then we make it abstract
// and we make subclass objects to get Publications

public abstract class Publication {
    // fields
    protected String title;
    protected String publisher;
    protected int numPages;
    protected double price;

    // DVC
    public Publication() {
        title = "BLANK TITLE";
        publisher = "BLANK PUBLISHER";
        numPages = -1;
        price = 0.0;
    }

    // EVC
    public Publication(String title, String publisher, int numPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numPages = numPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + numPages + ", " + price;
    }
}

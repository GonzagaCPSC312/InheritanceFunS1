


public class Magazine extends Publication {
    protected String pubFrequency; // weekly, monthly...

    public Magazine() {
        this.pubFrequency = "BLANK FREQUENCY";
    }

    public Magazine(String pubFrequency) {
        this.pubFrequency = pubFrequency;
    }

    public Magazine(String title, String publisher, int numPages, double price, String pubFrequency) {
        super(title, publisher, numPages, price);
        this.pubFrequency = pubFrequency;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + pubFrequency;
    }

    @Override
    public String generateCopyright() {
        return "TODO: to be implemented by Magazine";
    }
}



public class PublicationTester {
    public static void main(String[] args) {
        // task: create a Publication class
        // title, publisher, num pagers, price
        // toString() that returns a comma separated list of the field values
        // DVC, EVC
        // no getters and setters
        // test it out
//        Publication publication = new Publication();
//        System.out.println(publication);

        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("Tolkein");
        System.out.println(b2);
        System.out.println(b2.generateCopyright());

        Magazine m1 = new Magazine();
        System.out.println(m1);
        System.out.println(m1.generateCopyright());

        // polymorphism demo
        // lets make some Publication references
        Publication p1 = m1; // p1 is an alias for the object that m1 refers to
        Publication[] pubs = new Publication[5];
        pubs[0] = b1;
        pubs[1] = b2;
        pubs[2] = m1;
        pubs[3] = p1; // m1
        pubs[4] = new Publication() {
            @Override
            public String generateCopyright() {
                return "TODO: to be implemented by Anonymous Class";
            }
        };
        // polymorphism: same code, different behavior
        for (Publication pub : pubs) {
            System.out.println(pub);
            // dynamic binding: at runtime, the actual type of the
            // object that pub refers to is resolved
            System.out.println(pub.generateCopyright());
            System.out.println(pub.getClass());
            System.out.println("****");
        }
    }
}

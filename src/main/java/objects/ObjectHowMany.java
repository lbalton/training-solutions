package objects;

public class ObjectHowMany {

    public static void main(String[] args) {

    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();
    Book book4 = book1;
    Book book5 = book1;
    Book book6 = book3;
    Book book7 = null;
    book4 = book5;
    book5 = new Book();
    book6 = null;


    // Összesen 4-ez hoz létre. A 2-es és az 5-öshöz, illetve 4-hez és a 6-hoz.
}
}
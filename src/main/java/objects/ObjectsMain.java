package objects;


public class ObjectsMain {
    public static void main(String[] args) {

        new Book();

        System.out.println(new Book());

        Book emptyBook = null;

        System.out.println(emptyBook);

        Book book = new Book();

        System.out.println(book);

        book = null;

        book = new Book();

        System.out.println(book);

        Book anotherbook = new Book();

        System.out.println(book == anotherbook);

        System.out.println(anotherbook instanceof Book);

    }
}

package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Antoine de Saint-Exupéry", "The Little Prince");

        System.out.println("Szerző :" + book.getAuthor());

        System.out.println("Cím: "+ book.getTitle());

        book.register("01221");

        System.out.println("Regisztrációs szám: " + book.getRegNumber());




    }
}

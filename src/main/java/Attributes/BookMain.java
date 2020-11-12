package Attributes;

import Attributes.book.Book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Kis Herceg");

        System.out.println(book.getTitle());

        book.setTitle("Harry Potter");

        System.out.println(book.getTitle());

    }


}

package collectionsiterator;

import Arraymain.Books;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {


    private Set<Book> Books = new HashSet<>();

    public LibraryManager(Set<Book> books) {
        Books = books;
    }

    public Book findBookByRegNumber(int regNumber){

        Book thatBook;

        Iterator<Book> i = Books.iterator();

        while(i.hasNext()){
            thatBook = i.next();
            if (thatBook.getRegNumber() == regNumber){
                return  thatBook;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen regNumber :" + regNumber);
    }

    public int removeBookByRegNumber(int regNumber){

        Book thatBook;

        Iterator<Book> i = Books.iterator();

        while(i.hasNext()){
            thatBook = i.next();
            if (thatBook.getRegNumber() == regNumber){
                i.remove();
                System.out.println("sikeresen törölve:");
                return regNumber;
            }

        }
        throw new IllegalArgumentException("Nincs ilyen regNumber :" + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author){
        Book thatAuthor;

        return  null;

    }

}

package collectionscomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    List<Book> books = new ArrayList<>();


    public OrderedLibrary(List<Book> libraryBooks){
        books = libraryBooks;

    }

    public List<Book> orderedByTitle(){

        List<Book> orderListByTitle = new ArrayList<>(books);

        Collections.sort(orderListByTitle);

            return orderListByTitle;

    }

    public List<Book> orderedByAuthor(){

        List<Book> orderedByAuthor = new ArrayList<>(books);

        Collections.sort(orderedByAuthor, new AuthorComparator());

        return orderedByAuthor;


    }

    public List<String> orderedByTitleLocale(Locale locale){

        return null;
    }


}

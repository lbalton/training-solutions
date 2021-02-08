package genericsusage;

import java.util.ArrayList;
import java.util.List;

public class Generic {


    public Object WithOutGeneric() {
        List Book = new ArrayList();

        Book.add("Kis herceg");
        Book.add("Harry Potter");
        Book.add("How to trade");

        Object first = Book.get(0);

        return  first;
    }

    public  String WithGeneric(){

        List<String> Books = new ArrayList<>();
        Books.add("Macska");
        Books.add("Kutya");
        Books.add("Ló");

        String first = Books.get(0);

        return  first;
    }


    public static void main(String[] args) {

        Generic generic = new Generic();
        System.out.println(generic.WithOutGeneric());

        System.out.println(generic.WithGeneric());



    }
}

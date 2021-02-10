package searching;



public class BookArraySearch {


    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }


    public Book findBookByAuthorTitle(String author, String title){

        if ( author.isEmpty() || title.isEmpty()){
            throw new IllegalArgumentException("Szerző / cím nem lehet üres!");
        }

        return null;

    }



}

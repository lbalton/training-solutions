package inheritanceattributes;

public class Book {

    private String title;
    protected int price;

    public Book(String title) {
        this.title = title;

    }


    public String getTitle(){
        return title;
    }

    public int purchase(int pieces){
        return  pieces * pieces;
    }

}

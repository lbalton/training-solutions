package stringbasic;

public class Stringbasic {


    public String createStringForHeap(){
        String heap = new String("John Doe");
        return  heap;
    }


    public String createStringForPool() {
        String pool = "John Doe";
        return pool;
    }


}

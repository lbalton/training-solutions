package week5.week05d03.ListCounter;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {


    List<String> list = new ArrayList<>();

    public int countLetter (List<String> list){

        int i = 0;

        for (String li : list){
            li.toLowerCase();
            if ( li.toLowerCase().startsWith("a")){
                i++;
            }

    }
        return i;
    }

    public static void main(String[] args) {

        ListCounter listCounter = new ListCounter();

        List<String> fruits = new ArrayList<>();

        fruits.add("Alma");
        fruits.add("Ananász");
        fruits.add("Eper");
        fruits.add("Banán");
        System.out.println(listCounter.countLetter(fruits));



    }
}
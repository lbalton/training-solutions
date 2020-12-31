package week8.week08d03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StringLists{

    public List<String> stringListUnion(List<String> first, List<String> second){


        List<String> union = new ArrayList<>(first);

        for (String x : second){
            if(!union.contains(x)){
                union.add(x);
            }
        }
        return union;
    }

    public static void main(String[] args) {

        StringLists stringLists = new StringLists();

        List<String> firstBox = new ArrayList<>();
        firstBox.add("Alma");
        firstBox.add("Barack");
        firstBox.add("Körte");

        List<String> secondBox = new ArrayList<>();
        firstBox.add("Alma");
        firstBox.add("Narancs");
        firstBox.add("Szilva");

        System.out.println(stringLists.stringListUnion(firstBox, secondBox));



    }


}


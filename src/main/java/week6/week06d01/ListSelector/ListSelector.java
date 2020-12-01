package week6.week06d01.ListSelector;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {




    public String getEverySecond (List<String> text){

        StringBuilder result =  new StringBuilder();

        if (text == null){
            throw new IllegalArgumentException("Nem lehet üres a lista");
        }

        if (text.size() !=0){
            result.append("[");
            for(int i = 0; i < text.size(); i+=2){
                result.append(" ");
                result.append(text.get(i));
            }
            result.append("]");

        }
        return result.toString();
    }

    public static void main(String[] args) {

        ListSelector listSelector = new ListSelector();
        List<String> names = new ArrayList<>();
        names.add("Luca");
        names.add("Kinga");
        names.add("Géza");
        names.add("Feri");
        names.add("Szabi");
        names.add("Luca");
        names.add("Kinga");
        names.add("Géza");
        names.add("Feri");
        names.add("Szabi");
        System.out.println(listSelector.getEverySecond(names));


    }







}
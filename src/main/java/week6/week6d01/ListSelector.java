package week6.week6d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {




    public String getEverySecond (List<String> text){

        StringBuilder sb =  new StringBuilder();

        if (text == null){
            throw new IllegalArgumentException("Nem lehet üres a lista");
        }

        if (text.size() !=0){
            sb.append("[");
            for(int i = 0; i < text.size(); i+=2){
                sb.append(" ");
                sb.append(text.get(i));
            }
            sb.append("]");

        }
        return sb.toString();
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
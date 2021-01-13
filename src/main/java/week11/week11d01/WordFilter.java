package week11.week11d01;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> filterList = new ArrayList<>();
        String s = String.valueOf(c);

        for (String item : words) {
            if (item.contains(s)){
                filterList.add(item);
            }
        }
        return filterList;
    }

    public static void main(String[] args) {

        List <String> list1 = new ArrayList<>();
        list1.add("Alma");
        list1.add("Alma");
        list1.add("Alma");
        list1.add("Akadály");
        list1.add("Alom");
        list1.add("semmi");
        list1.add("hol");
        list1.add("Kali");
        list1.add("hohoho");
        list1.add("banán");
        list1.add("fa");
        list1.add("szilva");
        list1.add("méh");
        list1.add("szivar");


        System.out.println(new WordFilter().wordsWithChar(list1,'a'));

    }
}

package week14.week14d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){


        Map<Character, List<String> > namesWithKeys = new HashMap<>();


       for(String name : names){
           char character = name.charAt(0);
           if (!namesWithKeys.containsKey(character)){
               namesWithKeys.put(character, new ArrayList<>());
           }
           namesWithKeys.get(character).add(name);
       }
        return namesWithKeys;

    }

    public static void main(String[] args) {

        Indexer indexer = new Indexer();

        System.out.println(indexer.index(List.of("Alma","Baranck", "Körte","Kandalló")));




    }

}

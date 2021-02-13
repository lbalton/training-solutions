package week13.week13d05;

import java.util.*;

public class LetterCounter {

    public int Counter(String text){

        if (text.isBlank()){
            throw new IllegalArgumentException("Nem lehet üres a szöveg.");
        }

        String toLower = text.toLowerCase(Locale.ROOT);
        int sum;
        Set<Character> SetLi = new HashSet<>();

        final List<Character> ABC = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        for (int x = 0; x < toLower.length() ; x++)
            if (ABC.contains(toLower.charAt(x))){
                SetLi.add(toLower.charAt(x));
            }

        sum = SetLi.size();


        return sum;

    }

    public static void main(String[] args) {

        LetterCounter letterCounter = new LetterCounter();
        System.out.println(letterCounter.Counter("Alma"));
        System.out.println(letterCounter.Counter("öóüúőúáéű"));

        //TEST-> LetterCounterTest


    }

}

package week4.week4d02;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<Integer> getIndexesOfChar(String text, char c) {

        List<Integer> index = new ArrayList<>();

        String ch = String.valueOf(c);

        for (int x = 0; x < text.length(); x++) {
            if (!text.contains(ch)) {
                throw new IllegalStateException("A szöveg nem tartalmazza a karaktert : " + c);
            }
        }

        for (int x = 0; x < text.length(); x++) {
            if (text.charAt(x) == c) {
                index.add(x);

            }
        }

        return index;
    }

    public static void main(String[] args) {

        Search search = new Search();

        System.out.println(search.getIndexesOfChar("almafa", 'a'));


    }

}

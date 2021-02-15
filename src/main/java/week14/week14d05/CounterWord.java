package week14.week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CounterWord {

    public Map<String,Integer> wordCounter(BufferedReader bf, String... words) {

        Map<String, Integer> result = loadMap(words);

        try {
            String line;
            while ((line = bf.readLine()) != null) {
                for(String word : words){
                    if (line.toLowerCase().contains(word.toLowerCase())){
                        int count = result.get(word);
                        result.put(word,count+1);
                    }
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read the file", ioe);
        }

        return result;
    }





    public Map<String,Integer> loadMap(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for(String word : words){
            result.put(word,0);
        }
        return result;
    }

    public static void main(String[] args) {

        try (BufferedReader br = Files.newBufferedReader(Path.of("hachiko.srt"))) {
            CounterWord counterWord = new CounterWord();
            System.out.println(counterWord.wordCounter(br, "Hachiko", "pályaudvar", "jó", "haza"));

        } catch (IOException iae) {
            throw new IllegalArgumentException("Cant loading file", iae);
        }

    }

}

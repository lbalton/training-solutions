package week15.week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quizz {


    public BufferedReader Reader() {

        try {
            return Files.newBufferedReader(Path.of("Quizz.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read the file", ioe);
        }
    }

    public List<String> allQuestionInThisTheme(BufferedReader Bf, String Theme) {

        Set<String> theme = new HashSet<>();
        List<String> question = new ArrayList<>();
        List<String> inLi = new ArrayList<>();

        try {
            String line;
            while ((line = Bf.readLine()) != null) {
                inLi.add(line);
                String[] parts;
                if (Character.isDigit(line.charAt(0))) {
                    parts = line.split(" ");
                    String themes = parts[2];
                    theme.add(themes);
                    //System.out.println(themes);
                }
            }
            for (int x = 0; x < inLi.size(); x++) {
                if (inLi.get(x).contains(Theme)) {
                    question.add(inLi.get(x - 1) + "\n");
                }
            }
            if (!theme.contains(Theme)) {
                throw new IllegalArgumentException("Incorrect Theme! Use This:" + theme);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read the file", ioe);
        }

        return question;
    }

    public String randomQuestion(BufferedReader Bf) {

        List<String> part = new ArrayList<>();
        List<String> tempLi = new ArrayList<>();
        String line;
        Random random = new Random();

        try {
            while (((line = Bf.readLine()) != null)) {
                tempLi.add(line);
            }
            for (int x = 0; x < tempLi.size(); x++) {
                part.add(tempLi.get(x) + "\n" + tempLi.get(x + 1));
                x++;
            }
            int rnd = random.nextInt(part.size());

            return part.get(rnd);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read the file", ioe);
        }

    }


    public static void main(String[] args) {
        Quizz quizz = new Quizz();

       //System.out.println(quizz.allQuestionInThisTheme(quizz.Reader(),"matematika"));
       //System.out.println(quizz.randomQuestion(quizz.Reader()));


    }

}

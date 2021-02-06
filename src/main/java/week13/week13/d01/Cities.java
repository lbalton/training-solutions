package week13.week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Cities {

    public String shortestCitiName() {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("Cities.txt"))) {

            String line;
            String longestCiti = "";
            // bf.readLine(); //Skip first header line

            skipHeader(bf);

            while ((line = bf.readLine()) != null) {
                String[] Part = line.split(";");
                if (Part[1].length() > longestCiti.length()) {
                    longestCiti = Part[1];
                }

            }
            return longestCiti;


        } catch (IOException ioe) {
            throw new IllegalStateException("File nem található!", ioe);
        }

    }


    public void skipHeader(BufferedReader bf) throws IOException {
        bf.readLine();
    }

    public static void main(String[] args) {

        System.out.println(new Cities().shortestCitiName());

    }

}

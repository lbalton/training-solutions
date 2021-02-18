package exam03;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Histogram {


    public String createHistogram(BufferedReader bf){

        String star = "*";

        StringBuilder giveBack = new StringBuilder();


        try {
            String line;
            while ((line = bf.readLine()) != null) {

                int number = Integer.parseInt(line);

                giveBack.append(star.repeat(number) + "\n");

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read the file", ioe);
        }

        return giveBack.toString();
    }


    public static void main(String[] args) {

        Histogram histogram = new Histogram();

        try (BufferedReader br = Files.newBufferedReader(Path.of("histogram.txt"))) {

            System.out.println(histogram.createHistogram(br));

        } catch (IOException iae) {
            throw new IllegalArgumentException("Cant loading file", iae);
        }

    }

}
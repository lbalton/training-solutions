package week13.week13.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Cities {

    public String shortestCitiName() {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("Cities.txt"))) {
            String line;

            String citiLongest = ".";
            skipHeader(bf);
            while ((line = bf.readLine()) != null) {
                String[] part = line.split(";");
                String name = part[1];
                for (int i = 0; i < name.length(); i++) {
                    if (name.length() > citiLongest.length()) {
                        citiLongest = name;
                    }
                }

            }

            return citiLongest;

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public void skipHeader(BufferedReader bf) throws IOException {

        bf.readLine();
    }


    public static void main(String[] args) {
        Cities cities = new Cities();

        System.out.println(cities.shortestCitiName());

    }

}
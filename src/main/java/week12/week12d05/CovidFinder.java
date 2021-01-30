package week12.week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CovidFinder {


    public int wordScanner(String word) {
        Path path = Path.of("Index.html");


        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;
            int count = 0;

            while ((line = bf.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    count++;
                }
            }
            return count;

        } catch (IOException ioe) {
            throw new IllegalStateException("I cant read the file ", ioe);
        }


    }


    public String numberScanner(int num){

        Path path = Path.of("Index.html");

        try(BufferedReader br = Files.newBufferedReader(path)){

            String line;
            int counter = 0 ;
            String inStr = Integer.toString(num);


            while((line = br.readLine()) != null){
                if (line.contains(inStr)){
                counter++ ;
                }

            }
            return "A szám ennyiszer olvasható a szövegbe: " + counter;

        }catch (IOException ioe){
            throw new IllegalStateException("Cant read the file", ioe);
        }


    }


    public static void main(String[] args) {

        CovidFinder covidFinder = new CovidFinder();

        System.out.println(covidFinder.wordScanner("covid"));
        System.out.println(covidFinder.wordScanner("kutya"));
        System.out.print(covidFinder.numberScanner(1));


    }

}

package week12.week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Secretfiles {


    public void converter(Path path) {

        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte item : bytes) {
                char c = (char) (item + 10);
                System.out.print(c);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cant read the file", ioe);
        }

    }


    public static void main(String[] args) {

        new Secretfiles().converter(Path.of("secret.dat"));

    }
}
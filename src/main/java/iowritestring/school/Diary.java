package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Diary {



    public String newMark(String name, int rate){
        String St = name +" "+ rate;

        return St;
    }



    public static void main(String[] args) {

        Diary diary = new Diary();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a tanuló neve?");
        String name = scanner.nextLine();

        System.out.println("Hanyast Kapott?");
        int rate = scanner.nextInt();

        Path file = Path.of("tanulo_neve.txt");
        try {
            Files.writeString(file,name +" "+ rate, StandardOpenOption.APPEND);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }
}


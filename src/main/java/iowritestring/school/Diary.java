package iowritestring.school;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Diary {


    public String newMark(String name, int rate) {
        String St = name + " " + rate;

        return St;
    }

    public void reader() {

      Path file = Path.of("tanulo_neve.txt");
      try {
          String rate = Files.readString(file);
          System.out.println(rate);
      }
catch (IOException i){
          throw new IllegalStateException("Cant read the file", i);
}
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
            Files.write(file, List.of(name + " " + rate + " "), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

        diary.reader();

    }
}


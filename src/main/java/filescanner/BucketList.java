package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {


    public static void main(String[] args) {
            try(Scanner scanner = new Scanner(Path.of("bucketlist.txt"))) {
                while (scanner.hasNextLine()) {
                    String text = scanner.nextLine();
                    System.out.println(text);
                }
            } catch (IOException ioe) {
                System.out.println("Nem sikerült beolvasni a \"bucketlist.txt\" filet.");
            }


    }


}

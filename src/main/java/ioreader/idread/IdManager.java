package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class IdManager {


    public List<String> readIdsFromFile() {
        List<String> idN = new ArrayList<>();

        Path fileRead = Path.of("idnumbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(fileRead)) {
            String line;
            while ((line = reader.readLine()) != null) {
                idN.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        return idN;
    }


    public static void main(String[] args) {

        Path file = Path.of("idnumbers.txt");
        try {
            Files.writeString(file, "123456789HU\n123456ER\n123456789HU\n123456ER\n");
        } catch (IOException IO) {
            throw new IllegalStateException("Cant reach the file", IO);
        }


        IdManager idManager = new IdManager();

        System.out.println(idManager.readIdsFromFile());

    }
}

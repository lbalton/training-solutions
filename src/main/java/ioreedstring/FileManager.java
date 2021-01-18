package ioreedstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {


    private Path file;

    private List<Human> humans = new ArrayList<>();

    public FileManager(String filePath) {
        this.file = Path.of(filePath);
    }


    public void realFromFile() {

        try {
            List<String> fileInString = Files.readAllLines(file);
            for (String x : fileInString) {
                String firstAndLast[] = x.split(" ");
                Human human = new Human(firstAndLast[0], firstAndLast[1]);
                humans.add(human);
            }

        } catch (IOException x) {
            throw new IllegalStateException("File do not available", x);
        }
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public Path getMyFile(){
        return file;
    }

    public static void main(String[] args) {


    }

}
package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class StateRegister {

    static List<State> states = new ArrayList<>();

    static List<State> StateList(String filename) {

        Path file = Path.of("src/main/resources/" + filename);

        try (BufferedReader reader = Files.newBufferedReader(file)) {

            String line;
            while((line = reader.readLine()) != null) {
                String[] tempLi = line.split("-");
                State temp = new State(tempLi[0], tempLi[1]);
                states.add(temp);

            }
        } catch (IOException ex){
            throw new IllegalStateException("Nem olvasható a file",ex);
        }

        return states;
    }

}
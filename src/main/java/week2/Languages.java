package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Languages {

    public static void main(String[] args) {

        List<String> Languages = new ArrayList<>(3);

        Languages.add("Java");
        Languages.add("Python");
        Languages.add("JavaScript");

        for (String i : Languages) {
            if (i.length() > 5) {
                System.out.println(i);

    }
}
    }
}

package week13.week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectData {


    public int SubjectHours(String TeacherName) {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("Beosztas.txt"))) {

            List<String> lineList = new ArrayList<>();
            List<Integer> hours = new ArrayList<>();

            String line;
            String tempHour;
            int theHours = 0;

            while ((line = bf.readLine()) != null) {
                lineList.add(line);
            }
            for (int x = 0; x < lineList.size(); x++) {
                if (!lineList.contains(TeacherName)) {
                    throw new IllegalStateException("Név nem található! név:" + TeacherName);
                }
                if (lineList.get(x).equals(TeacherName)) {
                    tempHour = lineList.get(x + 3);
                    hours.add(Integer.parseInt(tempHour));
                }

            }

            for (int x = 0; x < hours.size(); x++) {
                theHours = hours.get(x) + theHours;
            }

            return theHours;

        } catch (IOException ioe) {
            throw new IllegalStateException("Nem lehet beolvasni a filet" + ioe);
        }
    }

    public List<String> NameOfTeacher() {

        try (BufferedReader bf = Files.newBufferedReader(Path.of("Beosztas.txt"))) {

            List<String> lineList = new ArrayList<>();
            List<String> teacherList = new ArrayList<>();

            String line;

            while ((line = bf.readLine()) != null) {
                lineList.add(line);
            }

               for (int x = 0; x < lineList.size(); x++ ) {
                   if (!teacherList.contains(lineList.get(x))){
                    teacherList.add((lineList.get(x)));
               }
                   x = x + 3;
               }

            return teacherList;

        } catch (IOException ieo) {
            throw new IllegalStateException("Nem olvasható a file");
        }
    }

    public static void main(String[] args) {


        System.out.println(new SubjectData().NameOfTeacher());
        System.out.println(new SubjectData().SubjectHours("Cet Celina"));
        System.out.println(new SubjectData().SubjectHours("Lepke Lenke"));


    }


}

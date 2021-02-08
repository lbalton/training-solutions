package week13.week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {


    public String merge(Path file, List<Employee> employees) {

        try {

            StringBuilder sb = new StringBuilder();
            String text = Files.readString(file);


            for (Employee employee : employees) {
                String replaceDateAndName = text.replace("{nev}", employee.getName());
                replaceDateAndName = replaceDateAndName.replace("{ev}", Integer.toString(employee.getYearOfBirth()));
                sb.append(replaceDateAndName + "\n");
            }

            return sb.toString();


        } catch (IOException IOE) {
            throw new IllegalStateException("Nem olvasható a file", IOE);
        }

    }


    public static void main(String[] args) {

        Path path = Path.of("Employee.txt");

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Jack Doe", 1950));
        employees.add(new Employee("Jane Doe", 1966));
        employees.add(new Employee("Karen Doe", 2000));


        String EmpConv = new TemplateMerger().merge(path, employees);

        System.out.println(EmpConv);


    }
}

package intromethod;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Wick", 2010, 132000);

        Scanner scanner = new Scanner(System.in);


        System.out.println(employee.toString());

        System.out.println(employee.getSalary());
        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());

        System.out.println("Szeretnél fizetés emelést? (IGEN/NEM)");
        String moreSalary = scanner.nextLine();

        if (moreSalary.equals("IGEN")){
            System.out.println("Megkapod");
            employee.raiseSalary(50000);
        }
            else if(moreSalary.equals("NEM")){
            System.out.println("Maradj szegény!");
        }
            else {
            System.out.println("IGEN VAGY NEM?!");
        }

        System.out.println(employee.getSalary() + " Ft" );
        System.out.println("Ime az új fizud.");



    }
}

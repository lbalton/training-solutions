package introdate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(1997,7,1, "Lengyel Bálint");

        System.out.println(employee.getName());
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());



    }

}

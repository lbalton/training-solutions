package debug;

import java.util.ArrayList;

public class CompanyMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Gábor", 1982);
        Employee employee2 = new Employee("Béla", 1942);
        Employee employee3 = new Employee("Zorro", 2001);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

    }
}

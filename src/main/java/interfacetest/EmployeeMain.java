package interfacetest;

public class EmployeeMain {

    public static void main(String[] args) {

    Employee employee = new Employee(100_000,new PercentBonusCalculator());
    Employee employee1 = new Employee(100_000,new FixBonusCalculator());


        System.out.println(employee.getBonus());
        System.out.println(employee1.getBonus());
    }
}
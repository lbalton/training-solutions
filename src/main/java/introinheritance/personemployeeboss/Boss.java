package introinheritance.personemployeeboss;

class Boss extends Employee {

     final double LEADERSHIP_FACTOR = 0.1;

     int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getSalary(){
        return salary = LEADERSHIP_FACTOR * numberOfEmployees + salary ;
    }

    public int getNumberOfEmployees(){
        return this.numberOfEmployees;
    }


}

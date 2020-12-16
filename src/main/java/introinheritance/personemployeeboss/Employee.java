package introinheritance.personemployeeboss;


class Employee extends Person{

    double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(int percent){
        this.salary = (salary / 100) * (100 + percent);
    }

}

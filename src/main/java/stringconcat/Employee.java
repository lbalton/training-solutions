package stringconcat;


public class Employee {

    private String name;
    private String job;
    private int salary;


    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;

        if (name.equals(null) || name.equals("") ){
            throw new IllegalArgumentException("Név kötelező!");
        }
        if (job.equals(null) || job.equals("")){
            throw new IllegalArgumentException("Munka kötelező!");
        }
        if (salary <= 0 && salary/3 != 0)
            throw new IllegalArgumentException("Fizetés megadása kötelező (pozitiv,1000-re kerekített szám");
        }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return name + " - " + job + " - " + salary;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Lengyel Bálint", "Junior Dev.", 123123);

        System.out.println(employee.toString());


    }

}


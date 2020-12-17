package introinheritance.personemployeeboss;

import java.lang.management.BufferPoolMXBean;

class BigBoss extends Boss {

  private double bonus;

    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary(){
        return super.getLEADERSHIP_FACTOR() * super.getNumberOfEmployees() + super.getSalary() + bonus;
    }

}

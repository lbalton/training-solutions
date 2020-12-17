package inheritanceconstructor.carjeep;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
      this.fuel = fuel;

        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Nem fér ennyi üzemanyag a tankba!");
        }
    }

    public void drive(int km){
        this.fuel -= ((fuelRate / 100) * km);

        if (this.fuel < 0){
            throw new IllegalArgumentException("\"Nincs elegendő üzemanyag az úthoz. Ennyi hiányzik:" + this.fuel);
        }
    }

    public double calculateRefillAmount(){
        return  tankCapacity - fuel;

    }

}

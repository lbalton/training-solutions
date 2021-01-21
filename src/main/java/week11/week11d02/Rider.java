package week11.week11d02;

public class Rider {

    private int dayNumber;
    private int rideNumber;
    private double km;


    public Rider(int dayNumber, int rideNumber, double km) {
        this.dayNumber = dayNumber;
        this.rideNumber = rideNumber;
        this.km = km;
        if (km == 0.0) {
            throw new IllegalArgumentException("A km nem lehet 0!");
        }
    }
    public int getDayNumber(){
        return dayNumber;
    }

    public int getRideNumber(){
        return rideNumber;
    }

    public double getKm(){
        return km;
    }
}

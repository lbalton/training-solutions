package examp3;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if ( boat.getMaxPassengers()>0){
            throw new IllegalStateException("The boat if full.");
        }
        new Passenger("John Doe", CruiseClass.LUXURY);
    }

    public double getPriceForPassenger(Passenger passenger) {

        passenger.getCruiseClass().;
    }

    public Passenger findPassengerByName(String name) {


    }

    public List<String> getPassengerNamesOrdered(){

    }


    public double sumAllBookingsCharged(){

    }

    public Map<CruiseClass, Integer> countPassangerByClass(){

    }

    public static void main(String[] args) {

        Boat boat = new Boat("Isti", 4);
        Cruise cruise = new Cruise(boat,LocalDate.of(2021, 1, 1), 100_000);

    }

}

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

        for (String item : )

    }

    public List<String> getPassengerNamesOrdered(){

    }


    public double sumAllBookingsCharged(){

    }

    public Map<CruiseClass, Integer> countPassangerByClass(){

    }

}

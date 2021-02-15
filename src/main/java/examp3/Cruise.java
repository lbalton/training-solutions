package examp3;


import java.time.LocalDate;
import java.util.*;

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

       passenger.getCruiseClass() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {

      List<Passenger> passengers = new ArrayList<>();


      Passenger find = ;

      for (Passenger item : passengers){
          if (!item.getName().equals(name)){
              throw new IllegalArgumentException("Nincs ilyen név!" + name);
          }
          if (item.getName().equals(name)){
              find = item;
          }
      }
      return find;
    }

    public List<String> getPassengerNamesOrdered(){

        List<Passenger> passengers = new ArrayList<>();

       Collections.sort(passengers, new Comparator<Passenger>() {
           @Override
           public int compare(Passenger o1, Passenger o2) {
               return 0;
           }
       });

    }


    public double sumAllBookingsCharged(){
        return 0.0;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        return null;
    }

}

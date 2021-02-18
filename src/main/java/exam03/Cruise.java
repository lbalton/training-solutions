package exam03;


import java.text.Collator;
import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {

        if (boat.getMaxPassengers() > passengers.size()) {
            passengers.add(passenger);
        } else {
            throw new IllegalArgumentException("Nincs elég hely!");
        }

    }

    public double getPriceForPassenger(Passenger passenger) {

        return passenger.getCruiseClass().getPrice()*basicPrice;
    }

    public Passenger findPassengerByName(String name) {

        for (Passenger passenger : passengers){
            if (passenger.getName().equals(name)){
                return passenger;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen utas.");
    }

    public List<String> getPassengerNamesOrdered() {

        List<String> names = new ArrayList<>();

        for (Passenger passenger : passengers){
           names.add(passenger.getName());
        }
        Collections.sort(names, Collator.getInstance(new Locale("HU","hu")));

        return names;
    }


    public double sumAllBookingsCharged() {

        double sum = 0;

        for (Passenger passenger : passengers){
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {

        Map<CruiseClass, Integer > result = new HashMap<>();

        for (Passenger passenger:passengers){
            if (!result.containsKey(passenger.getCruiseClass())){
                result.put(passenger.getCruiseClass(),0);
            }
            int count = result.get(passenger.getCruiseClass());
            count++;
            result.put(passenger.getCruiseClass(),count);
        }
        return result;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}

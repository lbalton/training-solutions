package week11.week11d02;


import java.util.ArrayList;
import java.util.List;

public class Courier {


    private List<String> rides = new ArrayList<>();

    public void addRiders(String ride){
        if(ride == null) {
            throw new IllegalArgumentException("Nem megfelelő szám");
        }

    }
}

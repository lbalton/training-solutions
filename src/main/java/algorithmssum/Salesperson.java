package algorithmssum;


import java.util.ArrayList;
import java.util.List;

public class Salesperson {

    private String name;
    private int amount;

    public Salesperson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }


    public int getAmount() {
        return amount;
    }


public int allInCome(List<Salesperson> sales){
        int sum = 0;
        for(Salesperson salesperson : sales){
            sum += salesperson.getAmount();
        }
return sum;
    }
}


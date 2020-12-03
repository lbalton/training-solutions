package algorithmsmax;

import java.util.Arrays;
import java.util.List;

public class ChoiceBestSeller {


    public Salesperson BestSeller(List<Salesperson> person){
        Salesperson theBestSellerPerson = null;
        for (Salesperson salesperson: person){
            if (theBestSellerPerson == null || salesperson.getAmount() > theBestSellerPerson.getAmount()){
                theBestSellerPerson = salesperson;
            }

        }
        return theBestSellerPerson;
    }


}

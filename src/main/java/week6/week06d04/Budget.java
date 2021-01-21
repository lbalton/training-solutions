package week6.week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

private List<Item> items;

    public Budget(List<Item> items){
        this.items = new ArrayList<>(items);
    }

    public List<Item> getItemsByMonth(int month){
        List<Item> result = new ArrayList<>();
        for ( Item item : items){
            if (item.getMonth() == month){
                result.add(item);
            }
        }
        return result;
    }
}

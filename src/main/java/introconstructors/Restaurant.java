package introconstructors;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private String name;
    private int capacity;
    private List<String> menu;


    public Restaurant(String name, int numberOfTables){
        this.name = name;
        this.capacity = numberOfTables * 4;
        this.menu = AddMenu();
    }

    public List<String> AddMenu(){
        return Arrays.asList("Burger", "Pizza", "Cheese Cake");
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getMenu() {
        return menu;
    }

}

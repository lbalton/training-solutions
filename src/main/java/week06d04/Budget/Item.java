package week06d04.Budget;

public class Item {

    private  String name;
    private int price;
    private int month;

    public Item(String name, int price, int month) {
        if (name == null||name.isBlank()){
            throw new IllegalArgumentException("Név nem lehet üres.");
        }

        if (price <= 0 ){
            throw new IllegalArgumentException("Az ár nullánál nagyobbnak kell hogy legyen.");
        }

        if ( month > 12 || month <= 0  ){
            throw new IllegalArgumentException("A hónap 1-12 között lehet.");
        }

        this.name = name;
        this.price = price;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }
}

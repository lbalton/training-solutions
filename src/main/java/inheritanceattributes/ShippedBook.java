package inheritanceattributes;

public class ShippedBook extends Book {


    public int shippingCost;

    public ShippedBook(String title, int shippingCost) {
        super(title);
    }


    public int order(int pieces){
    return pieces * price + shippingCost;
    }


}

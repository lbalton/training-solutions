package classstructureconstructors;

public class Store {
    private String product;
    private int stock;


    public int getStock() {
        return stock;
    }
    public Store(String product){
        this.product = product;

    }

    public void addstore(int ammout){
        stock = stock + ammout;

    }

    public void dispatch(int ammout){
        stock = stock - ammout;
    }



}

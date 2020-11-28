package week5.week05d04Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store{


    private  List<Product> productList = new ArrayList<>();

    public List<Product> getProductList(){
        return  productList;
    }

    public void addProduct(Product product){
        productList.add(product);

    }


}

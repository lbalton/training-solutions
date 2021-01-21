package week5.week05d04;

import week5.week05d04.Product;

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

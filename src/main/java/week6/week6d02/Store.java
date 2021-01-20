package week6.week6d02;

import week6.week6d02.Categ;
import week6.week6d02.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> proLi;

    public Store(List<Product> proLi) {
        this.proLi = proLi;
    }

    public List<Product> getProLi() {
        return new ArrayList<>(proLi);
    }

    public int getProductByCategoryName(Categ category) {
    return 0;
    }
}


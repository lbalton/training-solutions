package week6.week06d02;

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


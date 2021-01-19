package week2.week02d03;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product product){

        boolean isItEqual = false;

        if (product.name.equals(product.code)){
            isItEqual = true;
        }
        return isItEqual;
    }

    public static void main(String[] args) {

        Product product = new Product("körte","alma");

        System.out.println(product.areTheyEqual(product));

        Product keksz = new Product("keksz","keksz");

        System.out.println(keksz.areTheyEqual(keksz));


    }

}

package week2;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code){
        this.name = name;
        this.code = code;
}

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p){
      boolean nameEqual = this.name.equals(p);
      return true;
    }

    public static void main(String[] args) {



        Product phone = new Product("samsung", "000001");
        Product phone2 = new Product("samsung", "000002");
        Product chocolate = new Product("twix", "000003");

        System.out.println(phone.equals(phone2));
        System.out.println(phone2.equals(chocolate));
        System.out.println(phone.equals(chocolate));


    }

}
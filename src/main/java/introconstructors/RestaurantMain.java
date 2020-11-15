package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {


    Restaurant restaurant = new Restaurant("Szegedi Falatozó", 4);

        System.out.println("Maximális befogadóképesség: " + restaurant.getCapacity());

        restaurant.AddMenu();

        System.out.println(restaurant.getMenu());

        System.out.println(restaurant.getName());



    }

}
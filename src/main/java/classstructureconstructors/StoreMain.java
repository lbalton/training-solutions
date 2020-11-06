package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
    Store store = new Store("Twix");

        System.out.println(store.getStock());

    store.addstore(123);

        System.out.println(store.getStock());

    store.dispatch(23);

        System.out.println(store.getStock());

}
}
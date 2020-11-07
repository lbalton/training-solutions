package localvariables.localvariables;

public class DistanceMain {
    public static void main(String[] args) {

    Distance distance = new Distance(50.47, true);

        System.out.println(distance.getDistanceInKm() + "  " + distance.isExact());

        int theDistance = (int) distance.getDistanceInKm();

        System.out.println(theDistance);



 }
}

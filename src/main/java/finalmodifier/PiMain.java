package finalmodifier;

public class PiMain {
    public static void main(String[] args) {

        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        System.out.println(CircleCalculator.PI);

        System.out.println(cylinderCalculator.calculateVolume(3.4, 9.3));
        System.out.println(cylinderCalculator.calculateSurfaceArea(43.2, 5.5));




    }
}

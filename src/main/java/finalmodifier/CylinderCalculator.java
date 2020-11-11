package finalmodifier;

public class CylinderCalculator {

   CircleCalculator circleCalculator = new CircleCalculator();

    public double calculateVolume(double r, double h) {
        return r * r * CircleCalculator.PI * h;
    }

    public double calculateSurfaceArea(double r, double h){
        return r * h * CircleCalculator.PI;
    }

}

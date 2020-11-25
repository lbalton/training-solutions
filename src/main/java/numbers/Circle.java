package numbers;

public class Circle {

    private double atmero;
    private double pi ;

    public Circle(double atmero,double pi) {
        this.atmero = atmero;
        this.pi = pi;
    }

    public double korKerulete(){
    return pi * atmero;
    }

    public double korTerulete(){
        return pi * (atmero*atmero) / 4 ;

    }

    public static void main(String[] args) {

        Circle circleOne = new Circle(4.0,3.14);

        System.out.println("Az első kör kerülete: " + circleOne.korKerulete());
        System.out.println("Az első kör területe: " + circleOne.korTerulete());

        Circle circleTwo = new Circle(2.4, 3.14);

        System.out.println("A második kör kerülete: " + circleTwo.korKerulete());
        System.out.println("A második kör területe: " + circleTwo.korTerulete());

    }

}

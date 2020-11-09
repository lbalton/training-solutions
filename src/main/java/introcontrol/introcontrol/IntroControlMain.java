package introcontrol.introcontrol;

import introcontrol.introcontrol.IntroControl;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(11));

        System.out.println(introControl.describeNumber(10));

        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println(introControl.calculateBonus(1000000));

        System.out.println("A két érték közötti kölünbség: " + introControl.calculateConsumption(91111, 3222));

        introControl.printNumbers(2);
        introControl.printNumbersBetween(23, 22);
        introControl.printNumbersBetweenAnyDirection(21, 15);

    }
}

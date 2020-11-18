package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Feladat 1:      (12 - 6) * 2 - 3 ?");

        int Feladat1 = scanner.nextInt();
            if (Feladat1 == 9)
                System.out.println("Helyes a megoldás!");
                else System.out.println("Sajnos helytelen a megoldás!");


    System.out.println("Feladat 2:      12 - 6 * (2 - 3) ?");

        int Feladat2 = scanner.nextInt();
        if (Feladat2 == -19)
            System.out.println("Helyes a megoldás!");
                 else System.out.println("Sajnos helytelen a megoldás!");

    System.out.println("Feladat 3:      12 - (6 * 2) - 3 ?");

        int Feladat3 = scanner.nextInt();
        if (Feladat3 == -3)
            System.out.println("Helyes a megoldás!");
                else System.out.println("Sajnos helytelen a megoldás!");


    System.out.println("Feladat 3:      12 - (6 * 2 - 3) ?");

        int Feladat4 = scanner.nextInt();
        if (Feladat4 == 3)
            System.out.println("Helyes a megoldás!");
                else System.out.println("Sajnos helytelen a megoldás!");

    }
}

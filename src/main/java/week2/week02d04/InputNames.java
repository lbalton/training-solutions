package week2.week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];


        for (int x = 0; x < 5; x++) {
            System.out.println("Írj be egy nevet!");
            names[x] = scanner.nextLine();
        }


        for (int x = 0; x < 5; x++) {
            System.out.println(x +"." + names[x]);
        }

    }

}

package introcontrol.introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1-es Felhasználók kilistázása");
        System.out.println("2-es Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        int selected = scanner.nextInt();

        if (selected == 1){
            System.out.println("Felhasználók kilistázása");
        }

        if (selected == 2){
            System.out.println("Felhasználó felvétele");
        }
    }
}

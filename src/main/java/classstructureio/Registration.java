package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your nickname?");

        String nickName = scanner.nextLine();

        System.out.println("What is your email?");

        String email = scanner.nextLine();

        System.out.println("Felhasználó: " + nickName + "Email: " + email);

    }
}

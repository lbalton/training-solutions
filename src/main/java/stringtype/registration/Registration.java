package stringtype.registration;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();

        System.out.println("Adja meg a felhasználónevét");
            String username = scanner.nextLine();

        System.out.println("Adja meg a jelszvát!");
            String pass1 = scanner.nextLine();

        System.out.println("Adja meg mégegyszer a jeszavát!");
            String pass2 = scanner.nextLine();

        System.out.println("Adja meg az email címét!");
            String emailAddress = scanner.nextLine();


        System.out.println(userValidator.isValidUsername(username)? "Felhasználónév OK" : "Nem megfelelő a felhasználónév!");

        System.out.println(userValidator.isValidPassword(pass1,pass2)? "Jelszó OK": "Nem megfelelő a jelszó!");


    }
}

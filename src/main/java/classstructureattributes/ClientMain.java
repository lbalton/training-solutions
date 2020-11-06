package classstructureattributes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("What is your name?");

      String name = scanner.nextLine();

        System.out.println("What is your address?");
        String address = scanner.nextLine();


        System.out.println("Date of birth?");
        int year = scanner.nextInt();

        System.out.println("Name: "+ name + " Born: " + year + " Address: " + address  );

    }

}

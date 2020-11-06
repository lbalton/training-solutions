package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        client.setName("Lengyel Bálint");

        client.setYear(1997);

        client.setAddress("Szeged anna u.");

        System.out.println(" neve: " + client.getName() + " szül.éve: " + client.getYear() + " címe: "+ client.getAddress());

        System.out.println("Adja meg az új címét!");

        String newAddress = scanner.nextLine();

        client.migrate(newAddress);

        System.out.println("A címe sikeresen megváltozott: " + newAddress);

    }

}

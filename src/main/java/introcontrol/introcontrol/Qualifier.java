package introcontrol.introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mondj egy számot.");
        int number = scanner.nextInt();
            if (number > 100 ){
            System.out.println("Nagyobb mint 100");
        }
            else{
                System.out.println("Nem nagyobb mint 100");
            }
    }
}

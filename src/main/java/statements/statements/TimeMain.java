package statements.statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány óra?");
        int firstHour = scanner.nextInt();
        System.out.println("Hány perce?");
        int firstMinute = scanner.nextInt();
        System.out.println("Hány másodtpercet?");
        int firstSecold = scanner.nextInt();

        Time time = new Time(firstHour, firstMinute, firstSecold);

        System.out.println("Első időpont: " + time.toString() +" Az = " + time.getInMinutes()+ " perc ");
    }
}

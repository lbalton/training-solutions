package introcontrol.introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi az első szám?");
        int num1 = scanner.nextInt();

        System.out.println("Mi az második szám?");
        int num2 = scanner.nextInt();

        System.out.println("Mi az harmadik szám?");
        int num3 = scanner.nextInt();

        System.out.println("Mi az negyedik szám?");
        int num4 = scanner.nextInt();

        System.out.println("Mi az ötödik szám?");
        int num5 = scanner.nextInt();

        System.out.println(num1+num2+num3+num4+num5);

    }
}

package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");

        int number1 = scanner.nextInt();

        System.out.println("What is the second number?");

        int number2 = scanner.nextInt();

        System.out.println(number1 + "+" + number2);

        System.out.println(number1 + number2);

    }

    }

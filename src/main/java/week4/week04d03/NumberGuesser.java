package week4.week04d03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {


    public void WhatIsTheNumber() {

        Scanner scanner = new Scanner(System.in);

        int number = new Random().nextInt(101);

        int isItThatNumber;


        System.out.println("In this game, you have to find my number between 0-100.");
        System.out.println("GOOD LUCK!");

        System.out.println(" ");
        System.out.println("I think a number!");

        isItThatNumber = scanner.nextInt();

        while (number != isItThatNumber) {


            if (number < isItThatNumber) {
                System.out.println("This is too much");
                isItThatNumber = scanner.nextInt();

            } else if (number > isItThatNumber) {
                System.out.println("This is too less!");
                isItThatNumber = scanner.nextInt();
            }
        }

        if (number == isItThatNumber) {
            System.out.println("Yes, It was my number, good job!");
        }

    }


    public static void main(String[] args) {

        NumberGuesser numberGuesser = new NumberGuesser();

        numberGuesser.WhatIsTheNumber();


    }
}



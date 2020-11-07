package classstructureintegrate;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét!");
            String owner = scanner.nextLine();

        System.out.println("Számlaszám (kötőjellel elválasztva)?");
            String accountNumber = scanner.nextLine();

        System.out.println("Mi a nyitó egyenlege?");
            int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println(bankAccount.getInfo());


        System.out.println("Adja meg a másik ügyfél nevét!");
        String anotherOwner = scanner.nextLine();

        System.out.println("Új Számlaszáma (kötőjellel elválasztva)?");
            String anotherAccountNumber = scanner.nextLine();


        System.out.println("Mi az egyenlege?");
            int anotherBalance = scanner.nextInt();

        BankAccount anotherBankAccount = new BankAccount(anotherAccountNumber,anotherOwner,anotherBalance);

        System.out.println("Mennyit kíván befizetni az első számlára?");
        bankAccount.deposit(scanner.nextInt());

        System.out.println("Mennyit kíván befizetni a második számlára?");
        anotherBankAccount.deposit(scanner.nextInt());

        System.out.println("Mennyit utal át az első számlára?");
        System.out.println(bankAccount.getInfo());

        System.out.println("Mennyit kíván felvenni a másik számláróL?");
            anotherBankAccount.withdraw(scanner.nextInt());
            System.out.println(anotherBankAccount.getInfo());



        System.out.println("Mekkora összeg vezetne át az elsőszámláról a másikra?");
        int transferAmount = scanner.nextInt();

        bankAccount.transfer(anotherBankAccount, transferAmount);

        System.out.println(bankAccount.getInfo());
        System.out.println(anotherBankAccount.getInfo());
    }



}

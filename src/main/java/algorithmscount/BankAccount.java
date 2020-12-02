package algorithmscount;

public class BankAccount {
    private String nameOfOwener;
    private int accountNumber;
    private int balance;

    public BankAccount(String nameOfOwener, int accountNumber, int balance) {
        this.nameOfOwener = nameOfOwener;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwener() {
        return nameOfOwener;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}

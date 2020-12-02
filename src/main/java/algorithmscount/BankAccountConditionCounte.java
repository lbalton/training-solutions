package algorithmscount;

import java.util.Arrays;
import java.util.List;

public class BankAccountConditionCounte {



    public int showAllUnderLimitBalance(List<BankAccount>accounts, int ammont){

        int count = 0;

        for (BankAccount account : accounts ){
            if(account.getBalance() > ammont){
                count ++;
            }
        }
            return count;

    }

    public static void main(String[] args) {

        BankAccountConditionCounte bankAccountConditionCounte = new BankAccountConditionCounte();

        List<BankAccount> bankAccountsAsList = Arrays.asList(
                new BankAccount("John Doe",1232-12,123),
                new BankAccount("John Doe",1232-12,300),
                new BankAccount("John Doe",1232-12,1231),
                new BankAccount("John Doe",1232-12,4222),
                new BankAccount("John Doe",1232-12,33232),
                new BankAccount("John Doe",1232-12,1233),
                new BankAccount("John Doe",1232-12,5));

        System.out.println(bankAccountConditionCounte.showAllUnderLimitBalance(bankAccountsAsList, 4111));

    }

    }

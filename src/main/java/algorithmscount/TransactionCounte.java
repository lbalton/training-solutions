package algorithmscount;

import java.util.Arrays;
import java.util.List;

public class TransactionCounte {

    public int numberOfLitteTransactions(List<Transaction>Accounts, int minTrans){

        int count = 0;

        for (Transaction transaction : Accounts){
            if (transaction.getAmount()< minTrans){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        TransactionCounte transactionCounte = new TransactionCounte();

        List<Transaction> TransAsList = Arrays.asList(
          new Transaction("123123-2313212-312312",123),
          new Transaction("123123-2313212-312312",312),
          new Transaction("123123-2313212-312312",1323),
          new Transaction("123123-2313212-312312",4),
          new Transaction("123123-2313212-312312",213));

        System.out.println(transactionCounte.numberOfLitteTransactions(TransAsList,250));
    }
}

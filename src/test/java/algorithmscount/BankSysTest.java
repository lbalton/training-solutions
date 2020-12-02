package algorithmscount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankSysTest {
    @Test



    public void testCreatedTranslations(){



        List<Transaction> TransAsList = Arrays.asList(
                new Transaction("123123-2313212-312312",123),
                new Transaction("123123-2313212-312312",312),
                new Transaction("123123-2313212-312312",1323),
                new Transaction("123123-2313212-312312",4),
                new Transaction("123123-2313212-312312",213));

        assertEquals(4, new TransactionCounte().numberOfLitteTransactions(TransAsList, 350));
        assertEquals(1, new TransactionCounte().numberOfLitteTransactions(TransAsList, 10));

    }

    @Test

    public  void  testCreatedUnderLimit(){

        List<BankAccount> bankAccountsAsList = Arrays.asList(
                new BankAccount("John Doe",1232-12,123),
                new BankAccount("John Doe",1232-12,300),
                new BankAccount("John Doe",1232-12,1231),
                new BankAccount("John Doe",1232-12,4222),
                new BankAccount("John Doe",1232-12,33232),
                new BankAccount("John Doe",1232-12,1233),
                new BankAccount("John Doe",1232-12,5));

        assertEquals(2 ,new BankAccountConditionCounte().showAllUnderLimitBalance(bankAccountsAsList, 4000) );
    }


}

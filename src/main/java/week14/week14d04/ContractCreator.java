package week14.week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract temp;

    public ContractCreator(String name, List<Integer> monthlyPrices){
        temp = new Contract(name,monthlyPrices);
    }

    public Contract create(String client) {
        return  new Contract(client, new ArrayList<>(temp.getMonthlyPrices()));
    }


    public static void main(String[] args) {

        ContractCreator contractCreator = new ContractCreator("Nev nev",new ArrayList<>(List.of(10,10,10,10,10,10)));

        Contract contract1 = contractCreator.create("John Doe");
        Contract contract2 = contractCreator.create("Jack Doe");

        System.out.println(contract1);
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1,20);

        System.out.println(contract1);
        System.out.println(contract2);

    }
}

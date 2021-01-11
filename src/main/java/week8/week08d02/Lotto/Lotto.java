package week8.week08d02.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

    public List<Integer> randomNumbers(){


        List<Integer> Lotto = new ArrayList<>();

        for(int x = 0; x < 5 ; x++){
            int number = new Random().nextInt(90)+1;
            if(!Lotto.contains(number)){
                Lotto.add(number);
            }
            else if (Lotto.contains(number)){
                for (int i = 0; i < Lotto.size() ;i++){
                    if (Lotto.indexOf(i) == number){
                        Lotto.remove(i);
                    }
                }
                Lotto.add(new Random().nextInt(90)+1);
            }
        }
        return  Lotto;
    }


   public static void main(String[] args) {

        Lotto lotto = new Lotto();

        System.out.println(lotto.randomNumbers());

        System.out.println(lotto.randomNumbers().size());

    }
}


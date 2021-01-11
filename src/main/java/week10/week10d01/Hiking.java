package week10.week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {



   public double getPlusElevation(List<Double> High){

       double sum = 0;
       for (int x = 1; x < High.size() ;x++){
          if (High.get(x) > High.get(x-1)){
          sum += High.get(x)-High.get(x-1);
       }
       }

       return sum;

    }

    public static void main(String[] args) {
        Hiking hiking = new Hiking();

        List<Double>TestList = new ArrayList<>();

        TestList.add(12.2);
        TestList.add(21.2);
        TestList.add(32.2);
        TestList.add(2.2);
        TestList.add(2.5);
        TestList.add(3.4);

        System.out.println(hiking.getPlusElevation(TestList));

    }

}

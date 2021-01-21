package week7.week7d03;


import java.util.ArrayList;
import java.util.List;

public class NumberList {


    public boolean isIncreasing(List<Integer> numbersList){


      for (int i = 1; i < numbersList.size() ; i++){
          if (numbersList.get(i-1)> numbersList.get(i)){
              return  false;
          }
      }
      return true;
    }

    public static void main(String[] args) {
        NumberList numberList = new NumberList();

        List<Integer> numbersLi =  new ArrayList<>();
        numbersLi.add(1);
        numbersLi.add(3);
        numbersLi.add(3);
        numbersLi.add(7);
        numbersLi.add(111);
        numbersLi.add(3000);


        System.out.println(numberList.isIncreasing(numbersLi));


    }


}

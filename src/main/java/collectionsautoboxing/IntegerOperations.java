package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {


    public List<Integer> createList(int... numbers){

        List<Integer> num = new ArrayList<>();

        for (int i : numbers){
            num.add(i);
        }

        return num;

    }


    public int sumIntegerList(List<Integer> integerList){

        int sum = 0 ;

        for (int i : integerList){
            sum = sum + i;
        }


        return sum;
    }




    public int sumIntegerObjects(Integer... integers){

        int sum = 0;

        for (int i : integers){
            sum = sum + i;
        }

        return sum;

    }

    public static void main(String[] args) {


        IntegerOperations integerOperations = new IntegerOperations();
        System.out.println(integerOperations.createList(123,123,123,123,3,232,3,23,2,32,3,23,2,222));

       List<Integer> x = integerOperations.createList(123,123,123,123,3,232,3,23,2,32,3,23,2,222);

        System.out.println(integerOperations.sumIntegerList(x));

        System.out.println(integerOperations.sumIntegerObjects(1,2,3,4,5,6,0,1,0));


    }


}

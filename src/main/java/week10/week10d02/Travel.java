package week10.week10d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Travel {



    public int getMaxIndex(List<Integer> numbersList){

        int[] counter = new int[30];

        int index = 0;
        
        for (int x : numbersList){
            counter[x]++;
        }

        for (int x = 0; x < numbersList.size();x++){
            if(counter[index] < counter[x]){
                index = x;
            }
        }

        System.out.println(Arrays.toString(counter));

        return index;

    }

    public static void main(String[] args) {
         int max = new Travel().getMaxIndex(List.of(1,1,2,3,10,7,7,7,7));

        System.out.println(max);


    }

}

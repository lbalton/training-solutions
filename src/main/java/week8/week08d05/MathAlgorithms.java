package week8.week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    public int greatestCommonDivisor(int numOne, int numTwo){

        if (numOne < 0 || numTwo < 0 ){
            throw new IllegalArgumentException("Pozitív számot kell megadnod!");
        }

        int findMaxDivisor = 1;

        for (int possibleDivisor = 2; possibleDivisor<= Math.min(numOne, numTwo); possibleDivisor++){
            if (numOne % possibleDivisor == 0 && numTwo % possibleDivisor == 0){
                findMaxDivisor = possibleDivisor;
            }
        }
        return  findMaxDivisor;
    }


    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        System.out.println(mathAlgorithms.greatestCommonDivisor(6, 36));

    }
}

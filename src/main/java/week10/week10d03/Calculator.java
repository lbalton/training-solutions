package week10.week10d03;


import java.util.Arrays;


public class Calculator {


    public String findMinSum(int[] arr){

        Arrays.sort(arr);

        return "Legkissebb számok : " + arr[0] + "+" + arr[1] + "+" + arr[2] + "+" + arr[3] + "=" + (arr[0] +  + arr[1] +  + arr[2] +  + arr[3]);


   }



    public static void main(String[] args) {

        int[] myNum = {232, 55, 30, 5, 100, 30, 40, 2, 30, 40, 20, 30, 3, 20, 30, 2}; //12
        int[] myNum2 = {9,8,7,6,5,4,3,2,1,0,0,0,}; //1

        System.out.println(new Calculator().findMinSum(myNum));
        System.out.println(new Calculator().findMinSum(myNum2));

    }

}

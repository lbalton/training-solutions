package week7.week07d02;


public class DigitSum {

    public int sumOfDigits(int number) {

        int sum = 0 ;

        while (number!=0){
            sum += number %10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new DigitSum().sumOfDigits(123));


    }

}


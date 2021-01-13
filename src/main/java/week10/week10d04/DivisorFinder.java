package week10.week10d04;

public class DivisorFinder {

    public int findDivisors(int n){

        int num = 0;

        String inString = Integer.toString(n);

        for (int x = 0; x < inString.length() ;x++){
            int y = Integer.parseInt(inString.substring(x,x+1));
            if (n % y == 0){
                num ++;

            }
        }

        return num;
    }

    public static void main(String[] args) {

        System.out.println(new DivisorFinder().findDivisors(896));

    }

}

package week07d01;

public class MathAlgorithms {

    public boolean isPrime(int x){

        if (x <= 1)
            return false;

        for (int i = 2; i < x; i++){
            if (x % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        System.out.println(mathAlgorithms.isPrime(103));

    }
}

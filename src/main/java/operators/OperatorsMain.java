package operators;

public class OperatorsMain {
    public static void main(String[] args) {

        Operators operators = new Operators();

        System.out.println(operators.isEven(411));

        System.out.println(16<<1);
        System.out.println(16>>1);
        System.out.println(13>>1);
        System.out.println(13<<1);

        System.out.println("000000");
        System.out.println(operators.multiplyByPowerOfTwo(2, 1));


    }
}

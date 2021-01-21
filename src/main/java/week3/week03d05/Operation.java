package week3.week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int getResult(Operation operation) {

        int sum;
        sum = operation.leftOperand + operation.rightOperand;
        return sum;

    }

    public static void main(String[] args) {
        Operation operation = new Operation(10, 20);

        System.out.println(operation.getResult(operation));
    }

}

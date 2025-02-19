package study.week2.calculator;

public class Calculator {

    private final AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}

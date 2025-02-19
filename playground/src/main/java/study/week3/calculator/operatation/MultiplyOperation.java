package study.week3.calculator.operatation;

public class MultiplyOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber * secondNumber;
    }
}

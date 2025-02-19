package study.week3.calculator.operatation;

public class AddOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber + secondNumber;
    }
}

package study.week3.calculator.operatation;

public class SubstractOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber - secondNumber;
    }
}

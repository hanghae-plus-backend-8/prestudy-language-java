package study.week2.calculator.operatation;

import study.week2.calculator.AbstractOperation;

public class MultiplyOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber * secondNumber;
    }
}

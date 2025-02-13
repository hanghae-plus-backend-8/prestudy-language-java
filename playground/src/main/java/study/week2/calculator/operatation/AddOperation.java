package study.week2.calculator.operatation;

import study.week2.calculator.Operator;

public class AddOperation implements Operator {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber + secondNumber;
    }
}

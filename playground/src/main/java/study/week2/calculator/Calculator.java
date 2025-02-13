package study.week2.calculator;

import study.week2.calculator.operatation.AddOperation;
import study.week2.calculator.operatation.DivideOperation;
import study.week2.calculator.operatation.MultiplyOperation;
import study.week2.calculator.operatation.SubstractOperation;

public class Calculator {

    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator() {
        this.addOperation = new AddOperation();
        this.substractOperation = new SubstractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }

    public double calculate(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case "+" -> addOperation.operate(firstNumber, secondNumber);
            case "-" -> substractOperation.operate(firstNumber, secondNumber);
            case "*" -> multiplyOperation.operate(firstNumber, secondNumber);
            case "/" -> divideOperation.operate(firstNumber, secondNumber);
            default -> 0;
        };
    }
}

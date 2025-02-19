package study.week2.calculator;

import study.week2.calculator.operatation.AddOperation;
import study.week2.calculator.operatation.DivideOperation;
import study.week2.calculator.operatation.MultiplyOperation;
import study.week2.calculator.operatation.SubstractOperation;

public class CalculatorMain {

    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        Calculator addCalculator = new Calculator(addOperation);

        SubstractOperation substractOperation = new SubstractOperation();
        Calculator substractCalculator = new Calculator(substractOperation);

        MultiplyOperation multiplyOperation = new MultiplyOperation();
        Calculator multiplyCalculator = new Calculator(multiplyOperation);

        DivideOperation divideOperation = new DivideOperation();
        Calculator divideCalculator = new Calculator(divideOperation);

        int firstNumber = 20;
        int secondNumber = 10;

        System.out.println(addCalculator.calculate(firstNumber, secondNumber));
        System.out.println(substractCalculator.calculate(firstNumber, secondNumber));
        System.out.println(multiplyCalculator.calculate(firstNumber, secondNumber));
        System.out.println(divideCalculator.calculate(firstNumber, secondNumber));
    }
}

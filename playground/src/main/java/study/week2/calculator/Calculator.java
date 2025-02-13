package study.week2.calculator;

public class Calculator {

    public double calculate(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> (double) firstNumber / secondNumber;
            case "%" -> firstNumber % secondNumber;
            default -> 0;
        };
    }
}

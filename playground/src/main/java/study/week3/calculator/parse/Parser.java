package study.week3.calculator.parse;

import study.week3.calculator.Calculator;
import study.week3.calculator.exception.BadInputException;
import study.week3.calculator.operatation.*;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        int firstNumber = parseNum(firstInput);
        calculator.setFirstNumber(firstNumber);

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        int secondNumber = parseNum(secondInput);
        calculator.setSecondNumber(secondNumber);

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        AbstractOperation operation = parseOperation(operationInput);
        calculator.setOperation(operation);

        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }

    private int parseNum(String input) throws BadInputException {
        Pattern pattern = Pattern.compile(NUMBER_REG);

        if (!pattern.matcher(input).matches()) {
            throw new BadInputException("숫자");
        }

        return Integer.parseInt(input);
    }

    private AbstractOperation parseOperation(String operationInput) throws BadInputException {
        Pattern pattern = Pattern.compile(OPERATION_REG);

        if (!pattern.matcher(operationInput).matches()) {
            throw new BadInputException("연산자");
        }

        return createOperation(operationInput);
    }

    private AbstractOperation createOperation(String operationInput) throws BadInputException {
        switch (operationInput) {
            case "+" -> {
                return new AddOperation();
            }
            case "-" -> {
                return new SubstractOperation();
            }
            case "*" -> {
                return new MultiplyOperation();
            }
            case "/" -> {
                return new DivideOperation();
            }
            default -> throw new BadInputException("연산자");
        }
    }
}

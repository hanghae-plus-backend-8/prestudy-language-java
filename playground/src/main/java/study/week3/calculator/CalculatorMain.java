package study.week3.calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2.

        while (!calculateEnded) {
            try {
                calculateEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.err.println("계산기 에러: " + e.getMessage());
            }
        }
    }
}

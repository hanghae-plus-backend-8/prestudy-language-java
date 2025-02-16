package study.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReciptMemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> recipes = new ArrayList<>();

        // 입력
        String collectionName = scanner.nextLine();
        String cookTitle = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("끝")) {
                break;
            }
            recipes.add(input);
        }

        // 출력
        System.out.printf("[ %s 으로 자장된 %s ]%n", collectionName, cookTitle);
        for (int i = 0; i < recipes.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, recipes.get(i));
        }

    }
}

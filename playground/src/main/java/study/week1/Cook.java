package study.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> recipes = new ArrayList<>();

        // 입력
        String cookTitle = scanner.nextLine();
        float star = scanner.nextFloat();
        scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            recipes.add(scanner.nextLine());
        }

        int starInt = (int) star;
        float percent =  (float) (starInt * 100) / 5;

        // 출력
        System.out.printf("[ %s ]%n", cookTitle);
        System.out.printf("별점 : %d", starInt);
        System.out.printf(" (%f)%n", percent);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d. %s%n", i + 1, recipes.get(i));
        }

    }
}

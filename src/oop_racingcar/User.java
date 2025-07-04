package oop_racingcar;

import java.util.Arrays;
import java.util.Scanner;

public class User implements Player{

    Scanner scanner = new Scanner(System.in);

    @Override
    public String[] decideCarName() {
        String input = scanner.nextLine();
        return input.split(",");
    }

    @Override
    public int decideAttemptCount() {
        try {
            int value = Integer.parseInt(scanner.nextLine());

            if (value < 0) {
                throw new IllegalArgumentException("양수를 입력해주세요");
            }

            return value;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }
    }
}

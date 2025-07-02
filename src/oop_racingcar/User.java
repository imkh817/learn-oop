package oop_racingcar;

import java.util.Arrays;
import java.util.Scanner;

public class User implements Player{

    Scanner scanner = new Scanner(System.in);

    @Override
    public String[] decideName() {
        String input = scanner.nextLine();

        String[] carNames = input.split(",");

        Arrays.stream(carNames)
                .filter(name ->  name.length() > 5)
                .findFirst()
                .ifPresent(name -> {
                    throw new IllegalArgumentException("자동차의 이름은 5자리 이하로 정해주세요");
                });

        return carNames;

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

package oop_baseball.version2.input;

import oop_baseball.version2.validator.Validator;

import java.util.Scanner;

public class ConsoleInputView implements InputView {

    private Scanner scanner;
    private Validator validator;

    public ConsoleInputView(Scanner scanner, Validator validator){
        this.scanner = scanner;
        this.validator = validator;
    }

    @Override
    public String submitAnswer() {
        String answer = scanner.nextLine();

        if(!validator.isAnswerValid(answer)){
            System.out.println("answer = " + answer);
            throw new IllegalArgumentException();
        }

        return answer;
    }

    @Override
    public String wantPlayAgain() {
        String playAgain = scanner.nextLine();

        if(!validator.playAgainValid(playAgain)){
            throw new IllegalArgumentException();
        }

        return playAgain;
    }
}

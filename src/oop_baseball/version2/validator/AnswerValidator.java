package oop_baseball.version2.validator;

public class AnswerValidator implements Validator {
    @Override
    public boolean isAnswerValid(String input) {
        return input.matches("[1-9]\\d{2}");
    }

    @Override
    public boolean playAgainValid(String input) {
        return input.matches("^[12]$");
    }
}

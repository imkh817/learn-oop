package oop_baseball.version2.validator;

// 유효성 검사를 하는 책임
public interface Validator {

    boolean isAnswerValid(String input);

    boolean playAgainValid(String input);
}

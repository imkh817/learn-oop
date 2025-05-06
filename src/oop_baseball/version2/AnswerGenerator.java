package oop_baseball.version2;

public class AnswerGenerator {

    public String generateAnswer(){
        int number = (int) (Math.random() * 900) + 100; // 100~999
        return String.valueOf(number);

    }
}

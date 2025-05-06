package oop_baseball.version2.player;

import oop_baseball.version2.input.InputView;
import oop_baseball.version2.validator.Validator;

import java.util.Scanner;

public class BaseballPlayer implements Player {

    // Scanner를 사용한다.
    // 정답을 추측한다.
    // 이 때 숫자나 정답을 3자리를 안적는다면, 예외를 발생시킨다.
    // 그럼 이때 유효성 검사가 필요한데, 해당 유효성 검사를 하는 따로 클래스가 있으면 좋지않을까?

    private InputView inputView;

    public BaseballPlayer(InputView inputView) {
        this.inputView = inputView;
    }

    // 입력을 하는 책임 ? 정답을 유추하는 책임
    // inputView를 사용하게 되면 결국 위임만 하는거니까 Player객체자체가 없어도 될거같은데?
    @Override
    public String guessAnswer() {
        return inputView.submitAnswer();
    }
}

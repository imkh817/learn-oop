package oop_baseball.version2.output;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printStartMessage() {
        System.out.println("게임을 시작합니다.");
    }
    @Override
    public void askReplay(){
        System.out.println("게임을 계속 진행하시겠습니까? 재시작은 1번, 종료는 2번을 눌러주세요.");
    }

    @Override
    public void printNoting() {
        System.out.println("낫싱");
    }

    @Override
    public void printBall(int ball) {
        System.out.println(ball + "볼");
    }

    @Override
    public void printStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }

    @Override
    public void printOut() {
        System.out.println("아웃!");
    }
}

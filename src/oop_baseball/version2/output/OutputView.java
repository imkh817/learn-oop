package oop_baseball.version2.output;

// 출력을 하는 책임
public interface OutputView {
    void printStartMessage();
    void askReplay();
    void printNoting();
    void printBall(int ball);
    void printStrike(int strike);
    void printOut();
}

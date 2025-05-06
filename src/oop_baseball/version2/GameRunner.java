package oop_baseball.version2;

import oop_baseball.version2.input.InputView;
import oop_baseball.version2.output.OutputView;
import oop_baseball.version2.player.Player;
import oop_baseball.version2.referee.Referee;

// 흐름을 제어하는 책임
public class GameRunner {

    private OutputView outputView;
    private InputView inputView;
    private Player player;
    private Referee referee;
    private AnswerGenerator answerGenerator;

    public GameRunner(OutputView outputView,InputView inputView ,Player player, Referee referee){
        this.outputView = outputView;
        this.inputView = inputView;
        this.player = player;
        this.referee = referee;
        this.answerGenerator = new AnswerGenerator();
    }

    // 흐름을 제어하는 역할
    public void gameStart(){
        outputView.printStartMessage();
        String answer = answerGenerator.generateAnswer();
        System.out.println("answer = " + answer);

        while(true){
            String playerAnswer = player.guessAnswer();

            if(referee.judge(answer,playerAnswer)){
                outputView.askReplay();
                if("1".equals(inputView.wantPlayAgain())){
                    answer = answerGenerator.generateAnswer();
                    System.out.println("answer = " + answer);
                }else{
                    break;
                }
            }

        }

    }

    // TODO: 게임을 더 진행할지 물어보고 입력하는 책임은 누구에게 주는것이 맞을까?
    // TODO: Player는 현재 정답을 입력하는 행위를 가지고 있다.
    // TODO: 입력하는 행위로 보면 같지만, 정답을 입력하는 행위와 게임을 재시작/종료할지 여부를 입력하는 행위와는 성격이 다르다고 생각한다..
}

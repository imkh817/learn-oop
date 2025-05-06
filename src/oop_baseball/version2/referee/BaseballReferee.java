package oop_baseball.version2.referee;

import oop_baseball.version2.output.OutputView;

public class BaseballReferee implements Referee {

    private OutputView outputView;

    public BaseballReferee(OutputView outputView){
        this.outputView = outputView;
    }

    @Override
    public boolean judge(String answer, String playerAnswer) {
        int strike = 0;
        int ball = 0;

        for(int i = 0; i < 3; i++){
            char playerDigit = playerAnswer.charAt(i);
            if(playerDigit == answer.charAt(i)){
                strike++;
            } else if(answer.indexOf(playerDigit) != -1){
                ball++;
            }
        }

        if(strike == 0 && ball == 0){
            outputView.printNoting();
        } else {
            if(ball > 0) outputView.printBall(ball);
            if(strike == 3){
                outputView.printOut();
                return true;
            } else if(strike > 0) {
                outputView.printStrike(strike);
            }
            System.out.println();
        }
        return false;
    }
}

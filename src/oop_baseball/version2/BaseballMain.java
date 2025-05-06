package oop_baseball.version2;

import oop_baseball.version2.input.ConsoleInputView;
import oop_baseball.version2.input.InputView;
import oop_baseball.version2.output.ConsoleOutputView;
import oop_baseball.version2.output.OutputView;
import oop_baseball.version2.player.BaseballPlayer;
import oop_baseball.version2.player.Player;
import oop_baseball.version2.referee.BaseballReferee;
import oop_baseball.version2.referee.Referee;
import oop_baseball.version2.validator.AnswerValidator;

import java.util.Scanner;

public class BaseballMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputView inputView = new ConsoleInputView(scanner, new AnswerValidator());
        OutputView outputView = new ConsoleOutputView();

        Player player = new BaseballPlayer(inputView);
        Referee referee = new BaseballReferee(outputView);

        GameRunner gameRunner = new GameRunner(outputView,inputView, player, referee);
        gameRunner.gameStart();
    }
}

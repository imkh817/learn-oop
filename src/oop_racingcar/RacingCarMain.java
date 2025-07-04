package oop_racingcar;

import java.util.Arrays;
import java.util.List;

public class RacingCarMain {
    public static void main(String[] args) {
        RacingCarGame game = new RacingCarGame(new User(), new DefaultCarFactory(new RandomGenerator()), new Judge());
        game.gameStart();

    }
}

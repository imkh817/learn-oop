package oop_racingcar;

import java.util.Random;

public class RandomGenerator {

    Random random = new Random();

    public int provideRandomValue(){
        return random.nextInt(10);
    }
}

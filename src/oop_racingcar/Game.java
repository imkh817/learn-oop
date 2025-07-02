package oop_racingcar;

import java.util.List;

// 게임을 조율하는 책임
public interface Game {
    List<Car> moveCar(List<Car> cars, int attemptCount);
}

package oop_racingcar;

import java.util.List;

public interface CarFactory {

    List<Car> create(String[] carName);
}

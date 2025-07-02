package oop_racingcar;

import java.util.ArrayList;
import java.util.List;

public class DefaultCarFactory implements CarFactory {
    @Override
    public List<Car> create(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for(String carName : carNames){
            cars.add(new Car(carName, new RandomGenerator(), new CarPosition()));
        }

        return cars;
    }
}

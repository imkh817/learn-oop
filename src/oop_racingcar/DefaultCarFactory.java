package oop_racingcar;

import java.util.ArrayList;
import java.util.List;

public class DefaultCarFactory implements CarFactory {

    private final RandomGenerator randomGenerator;

    public DefaultCarFactory(RandomGenerator randomGenerator){
        this.randomGenerator = randomGenerator;
    }

    @Override
    public List<Car> create(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for(String carName : carNames){
            cars.add(new Car(carName, randomGenerator, new CarPosition()));
        }

        return cars;
    }
}

package oop_racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Judge implements Judgement{
    @Override
    public void judge(List<Car> cars) {
        int maxGrade = getMaxGrade(cars);
        List<Car> winners = getWinners(cars, maxGrade);
        printWinners(winners);
    }

    private void printWinners(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));

        System.out.printf("축하합니다! 우승자는 %s 입니다.%n", winnerNames);
    }

    private List<Car> getWinners(List<Car> cars, int maxGrade) {
        return cars.stream()
                .filter(car -> car.getCarPosition().getPostion() == maxGrade)
                .toList();
    }

    public int getMaxGrade(List<Car> cars){
        return cars.stream()
                .mapToInt(car -> car.getCarPosition().getPostion())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("1등이 없습니다."));
    }
    
}

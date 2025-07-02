package oop_racingcar;

import java.util.List;

public class RacingCarGame {

    private final User user;
    private final CarFactory carFactory;
    private final Judgement judge;

    public RacingCarGame(User user, CarFactory carFactory, Judgement judge) {
        this.user = user;
        this.carFactory = carFactory;
        this.judge = judge;
    }

    public void gameStart(){
        System.out.println("n대의 자동차 이름을 정해주세요.");
        String[] carName = user.decideName();
        List<Car> cars = carFactory.create(carName);

        System.out.println("시도할 횟수를 입력해주세요");
        int attemptCount = user.decideAttemptCount();
        List<Car> movedCars = moveCar(cars, attemptCount);// Game이 moveCar를 호출하는게 맞을까? carRunner를 따로 빼?, 아니지 단순 for문만 돌릴뿐 움직이는건 차지

        judge.judge(movedCars);


    }



    public List<Car> moveCar(List<Car> cars ,int attemptCount) {
        for(int i=0; i<attemptCount; i++){
            for(Car car : cars){
                car.move();
                car.printCurrentPosition();
            }
            System.out.println("--------------------------");
        }

        return cars;
    }
}

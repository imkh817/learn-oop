package oop_racingcar;

public class Car {
    private String carName;
    private final RandomGenerator randomGenerator;
    private final CarPosition carPosition;

    public Car(String carName, RandomGenerator randomGenerator, CarPosition carPosition) {
        this.carName = carName;
        this.randomGenerator = randomGenerator;
        this.carPosition = carPosition;
    }

    public void move(){
        if(shouldGo()){
            carPosition.forward();
        }
    }


    private boolean shouldGo(){
        return randomGenerator.provideRandomValue() >=4;
    }

    public void printCurrentPosition(){
        System.out.printf("%s : %s%n",this.carName, carPosition);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}

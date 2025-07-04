package oop_racingcar;

public class Car {
    private static final int MAX_CAR_NAME = 5;
    private String carName;
    private final RandomGenerator randomGenerator;
    private final CarPosition carPosition;

    public Car(String carName, RandomGenerator randomGenerator, CarPosition carPosition) {
        validateCarName(carName);
        this.carName = carName;
        this.randomGenerator = randomGenerator;
        this.carPosition = carPosition;
    }

    public void move(){
        if(shouldGo()){
            carPosition.toForward(); //toForward가 더 나은 선택
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

    private void validateCarName(String carName){
        if(carName == null || carName.trim().isEmpty()){
            throw new IllegalArgumentException("자동차의 이름이 입력되지 않았습니다.");
        }

        if(carName.length() > MAX_CAR_NAME){
            throw new IllegalArgumentException("자동차의 이름은 5자리 이하로 정해주세요");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}

package oop_racingcar;

public class CarPosition {
    private int postion = 0;

    public void forward(){
        postion++;
    }

    public String toString(){
        return "-".repeat(postion);
    }

    public int getPostion() {
        return postion;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }
}

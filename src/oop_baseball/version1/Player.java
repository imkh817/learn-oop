package oop_baseball.version1;

import java.util.Scanner;

public class Player {
    Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputNumber(){
        try{
            int inputNumber = scanner.nextInt();
            return inputNumber;
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}

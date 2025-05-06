package oop_baseball.version1;

import java.util.Scanner;

public class BaseballMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager gameManager = new GameManager(new Player(scanner), new Judge(), scanner);
        gameManager.gameStart();
    }
}

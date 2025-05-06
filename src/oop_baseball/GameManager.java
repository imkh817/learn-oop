package oop_baseball;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {

    Player player;
    Judge judge;
    Scanner scanner;

    public GameManager(Player player, Judge judge,Scanner scanner) {
        this.player = player;
        this.judge = judge;
        this.scanner = scanner;
    }

    public void gameStart(){
        System.out.println("게임을 시작합니다.");
        int number = this.decideRandomNumber();
        System.out.println("number = " + number);

        while(true){
            System.out.println("3자리 숫자를 입력해주세요.");
            int inputNumber = player.inputNumber();
            boolean isThreeStrike = judge.judgment(number,inputNumber);

            if(isThreeStrike && !this.wantPlayAgain()){
                break;
            }else if(isThreeStrike && this.wantPlayAgain()){
                number = this.decideRandomNumber();
            }
        }

    }

    public int decideRandomNumber(){
        return (int)(Math.random() * 900) + 100; // 100 ~ 999 사이의 임의의 3자리 숫자
    }

    public boolean wantPlayAgain(){
        try{
            System.out.println("게임을 계속 진행하려면 1번, 게임을 끝내려면 2번을 눌러주세요.");
            int playAgain = scanner.nextInt();
            if(playAgain == 1){
                return true;
            }
            return false;
        }catch (InputMismatchException e){
            throw new IllegalArgumentException();
        }
    }
}


package oop_baseball;

public class Judge {

    // 판정을 한다.
    public boolean judgment(int randomNumber,int playerNumber){
        String answer = String.valueOf(randomNumber);
        String input = String.valueOf(playerNumber);

        int strike = 0;
        int ball = 0;

        for(int i = 0; i < 3; i++){
            char playerDigit = input.charAt(i);
            if(playerDigit == answer.charAt(i)){
                strike++;
            } else if(answer.indexOf(playerDigit) != -1){
                ball++;
            }
        }

        if(strike == 0 && ball == 0){
            System.out.println("낫싱");
        } else {
            if(ball > 0) System.out.print(ball + "볼 ");
            if(strike == 3){
                System.out.println("3스트라이크 아웃!");
                return true;
            } else if(strike > 0) {
                System.out.print(strike + "스트라이크 ");
            }
            System.out.println();
        }
        return false;
    }
}

package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;


public class Computer {
    //컴퓨터가 가질 정답값의 각 자리수의 숫자저장 멤버변수
    int com100, com10, com1;

    //정답(중복되지 않는 랜덤숫자)을 만들어내는 기능
    void makeNumbers(){

        while(true){
            com100= Randoms.pickNumberInRange(1,9);
            com10= Randoms.pickNumberInRange(1,9);
            com1= Randoms.pickNumberInRange(1,9);

            if(com100!=com10 && com100!=com1 && com10!=com1) break;
        }

    }


    //전달받은 값이 정답인지 체크.
    boolean checkAnswer(String answer) {
        if (answer.length() != 3 || !answer.matches("[1-9][1-9][1-9]")) {
            throw new IllegalArgumentException();
        }

        int user100 = answer.charAt(0) - 48;
        int user10 = answer.charAt(1) - 48;
        int user1 = answer.charAt(2) - 48;
        int strike = countStrike(user100, user10, user1);
        int ball = countBall(user100, user10, user1);

        printResult(strike, ball);

        return strike == 3;
    }

    // 스트라이크만 체크
    private int countStrike(int user100, int user10, int user1) {
        int strike = 0;
        if (user100 == com100) strike++;
        if (user10 == com10) strike++;
        if (user1 == com1) strike++;
        return strike;
    }

    // 볼만 체크
    private int countBall(int user100, int user10, int user1) {
        int ball = 0;
        if (user100 == com10 || user100 == com1) ball++;
        if (user10 == com100 || user10 == com1) ball++;
        if (user1 == com100 || user1 == com10) ball++;
        return ball;
    }

    // 결과 출력
    private void printResult(int strike, int ball) {
        if (strike == 3) {
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike > 0 || ball > 0) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
        System.out.println();
    }

    // 다시할껀지 여부
    boolean askForRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String choice = Console.readLine();
        if (!choice.matches("[1-2]")){
            throw new IllegalArgumentException();
        }
        return choice.equals("1");
    }


}

package baseball;

import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {


        while (true) {
            // 상대방 게이머인 컴퓨터 객체 생성
            Computer com = new Computer();

            // 컴퓨터 객체에게 정답값을 만들어 내도록 요청.
            com.makeNumbers();

            while (true) {
                // 사용자로부터 숫자 입력 받기
                System.out.print("3자리 숫자 입력 : ");
                String userNumber = Console.readLine();

                // 컴퓨터에게 사용자로부터 입력받은 값이 정답인지 체크하도록..
                boolean result = com.checkAnswer(userNumber);

                // 정답이 맞으면 반복 종료..
                if (result) break;
            }

            if (!com.askForRestart()) {
                break; // 게임 종료
            }
        }

        System.out.println("게임 종료.");
    }
}

# 기능 목록 정의

## 목차
- [입력](#입력)
- [세 자리 난수 저장](#세-자리-난수-저장)
- [사용자의 값 저장](#사용자의-값-저장)
- [결과 창](#결과-창)
- [재시작 여부](#재시작-여부)

## 입력
제시한 요구사항의 라이브러리에 적혀있는
사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용

## 세 자리 난수 저장
세 자리의 각 수가 1~9까지 랜덤한 수이며 겹치면 안됨, Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `pickNumberInRange()`를 
활용 고로 Computer 객체의 makeNumbers()메서드로 정의 Computer 객체의 12번째에 정리

## 사용자의 값 저장
사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용하여 값을 추출한다. 자릿수가 초과하거나 잘못된 값을 입력할 경우,
사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션을 종료한다.

## 결과 창
각 스트라이크와 볼 유무를 알려주는 함수를 Computer 객체의 `checkAnswer(String answer)` 26번째 줄에 정의한다.
메서드별로 스트라이크를 카운트하는 `countStrike(int user100, int user10, int user1)` 43번 줄과 볼을 카운트하는 `countBall(int user100, int user10, int user1)` 52번 줄을 구현하고, 이를 토대로 결과를 출력하는 `printResult(int strike, int ball)` 메서드를 사용한다.

## 재시작 여부
`askForRestart()` 메서드는 74번 줄에 구현되어 있으며, 1을 입력하면 재시작하고 2를 입력하면 종료한다.

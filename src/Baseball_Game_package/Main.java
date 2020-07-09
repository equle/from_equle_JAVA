package Baseball_Game_package;

import java.util.Enumeration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Computer[] = new int[3]; // 컴퓨터 배열
        int User[] = new int[3]; // 사용자 배열
        int num = 0; // 스캔된 값 변수
        int count = 0; // 몇번 시도했는가
        boolean loop = true;
        boolean cv = false;
        int strike = 0;
        int ball = 0;

        // Computer의 배열 값 입력
        for (int i = 0; i < Computer.length; i++){
            // 랜덤으로 값 생성후 입력
            Computer[i] = (int)(Math.random() * 9) + 1;
            // 중복 방지 반복문 (i == Computer.length)
            for (int j = 0; j < i; j++){
                // 반복중 값이 같으면 i--로 다시 반복하여 값을 입력
                if(Computer[j] == Computer[i]){
                    i--;
                    break;
                }
            }
        }

        // User의 배열 값 입력
        // Scanner를 통해 값 입력 받음
        Scanner sc = new Scanner(System.in);

        while (loop) {
            cv = true;
            System.out.print("1 ~ 9의 정수를 입력하세요   >>");

            for (int i = 0; i < User.length; i++) {
                // 받은 값을 입력
                num = sc.nextInt();
                if (num < 0 || num > 10) {
                    System.out.print("1 ~ 9의 정수를 입력하세요   >>");
                }
                //입력
                User[i] = num;

                // 중복 표시
                for (int j = 0; j < i; j++) {
                    if (User[j] == User[i]){
                        cv = false;
                    }
                }
            }

            // 중복이 없으면 실행
            // 중복으로 실행하지 못하고 지나갈 경우 ball : 3 고정으로 게임 끝나지 않음
            if (cv == true) {
                // 컴퓨터와 유저 배열 비교
                for (int c = 0; c < Computer.length; c++) {
                    for (int u = 0; u < User.length; u++) {
                        if (Computer[c] == User[u] && c == u) {
                            // 스트라이크 적재
                            strike++;
                            cv = false;
                        }
                    }
                }
            }

            // 비교 값으로 ball 값 추출
            ball = 3 - strike;

            // 결과 값 출력
            System.out.println("S : " + strike);
            System.out.println("B : " + ball);

            // S : 3일 경우 false 아닐경우 다시 루프되며 시도 횟수 증가
            if (strike >= 3) {
                loop = false;
            }
            // 실행 회숫 적재
            count++;

            //초기화
            strike = 0;
            ball = 0;

        }

        // 엔딩
        System.out.println("시도 횟수 : " + (count - 1));
        System.out.println("Game Over");
        sc.close();
    }
}

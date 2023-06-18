package javaStandard;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        // if문
        // 조건식이 참(true)일 때, 괄호 {}안의 문장들을 수행한다
        
        // 연산결과가 true or false
        // if(조건식) {
        //     조건식이 참(true)일 때 수행될 문장들을 적는다
        // }

        // 중첩 if문 - if문 안의 if

        // if(조건식 1) {
        //     조건식 1의 연산결과가 true일 때 수행될 문장들을 적는다.
        //     if(조건식 2) {
        //         조건식 1과 조건식2가 연산결과가 true일 때 수행될 문장들을 적는다
        //     } else {
        //         조건식 1이 true이고, 조건식2가 false일 때 수행되는 문장들
        //     }
        // } 조건식 1이 false일 때 수행되는 문장들


        int score = 0;
        char grade = ' ', opt='0';

        System.out.println("점수를 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수 저장
        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if(score>=90) {
            grade = 'A';
            if(score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if(score >=88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        }
        System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
    }
}

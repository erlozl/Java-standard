package javaStandard;

public class For {
    public static void main(String[] args) {
        // 조건을 만족하는 동안 {}을 반복 - 반복횟수를 알 때 적합
        // 반복횟수 모를 때 while문이 적합

        for(int i=0; i<=5; i++) {
            // 초기화,조건식,증감식
            // 1부터 5까지 1씩 증가
            System.out.println("I can do it");
            // 수행될 문장
        }
        for(int i=1; i<=10; i=i+2) {
            // i = 1,3,5,7,9
            System.out.println(i);
        }
        // 간단히 실행결과를 미리 예측해보고 
        // 실행시키는 게 좋음

        // 조건식 주의깊게 쓰자!
        for(int i=10; i >= 1; i--) {
            // i = 1,3,5,7,9
            System.out.println(i);
        }

        for(int i=1, j=5; i<=10; i++,j--) {
            System.out.println("i = "+ i + " j = "+j);
        }

        int score=0; // 범위 - 선언위치부터 선언된 블럭의 끝까지
        for(int i=1;  i<=10; i++) {
            score += i;
        }
        System.out.println(score);
        
        System.out.println("------------------");

        // 중첩 for문

        // 안쪽 for문이 끝난 다음에 바깥쪽 for문이 돈다
        for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }

        // 줄을 의미
        for(int i=1; i<=5; i++) {
            // 칸을 의미
           for(int j=1; j<=10; j++) {
            System.out.print("*");
           }
           System.out.println();
        }
    }
}

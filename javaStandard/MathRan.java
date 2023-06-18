package javaStandard;

public class MathRan {
    public static void main(String[] args) {
        // Math.random(); - 0.0과 1.0사이의 임의의 double값을 반환
        // 0.0 <= Math.random() < 1.0
        // ㅡ> 0.0 ~ 0.99999

        // ex) 1~3정수를 얻고 싶을 때
        // (int)(Math.random() * 3 ) + 1
        // 여기서 *3은 내가 원하는 개별값의 갯수를 적는다

        int num = 0;
        for(int i=0; i<=10; i++) {
            System.out.println(Math.random());
            System.out.println((int)(Math.random()*11)-5);
            // -5 <= x < 6
        }
    }
}

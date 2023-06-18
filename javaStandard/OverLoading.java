package javaStandard;
    // 오버로딩이 성립하기 위한 조건
        // 1. 메서드 이름이 같아야 한다
        // 2. 매개변수의 개수 또는 타입이 달라야 한다
        // 3. 반환 타입은 영향없다

    // 하는 작업이 같을 때 오버로딩
 
class OverClass {
    int overExam(int a, int b) {
        return a+b;
    }
    String overExam(String a, String b) {
        System.out.println("String a, String b");
        return a+b;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        // 오버로딩이란
        // 한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것

        // 대표적 예) println();
        // 이 안에 매개변수가 다름

        OverClass oc = new OverClass();
        oc.overExam(0, 0);
        // System.out.print(oc.overExam("의 값은"+"3","5"));
        String value = oc.overExam("와"+"3","5");
        System.out.println(value);
    }
}

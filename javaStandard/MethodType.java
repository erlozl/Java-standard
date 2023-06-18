package javaStandard;

class MyMath2 {
    int a,b;

    int add () {
        return a+b;
    }
    static int add(int a, int b) {
        return a+b;
    }
}
public class MethodType {
    public static void main(String[] args) {
        // static 메서드 - 클래스 메서드
        // 객체 생성없이 클래스 이름.메서드 이름()으로 호출
        // 인스턴스멤버와 관련된 작업을 하는 메서드
        // 메서드 내에서 인스턴스 변수 사용가능
        
        // 인스턴스 메서드는 - static 이 안 붙음
        // 인스턴스 생성 후, 참조변수.메서드 이름()으로 호출
        // ex)Math.random();
        // 인스턴스멤버와 관련없는 작업을 하는 메서드
        // 메서드 내에서 인스턴스 변수 사용불가

        MyMath2 mm2 = new MyMath2();
        System.out.println(mm2.add());
        System.out.println(MyMath2.add(3,5)); 

        // static은 언제 붙여서 사용하는가
        // static 메서드 사용할 때는 객체가 필요없음
        // 객체 생성없이도 항상 호출가능

        // 인스턴스 메소드를 사용하지 않는 메서드는
        // static 붙여서 사용 가능

        // 속성중에서 공통속성에 static을 붙인다
        // 인스턴스 변수 (개별 속성)
        // class Card {
        //     String kind;
        //     int number;
        // }
        // static 변수 (공통 속성) 
        // static int width = 100;
        // static int height = 100;

    }
}

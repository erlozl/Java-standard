package javaStandard;
// 인터페이스란
// = 추상 메서드의 집합 [핵심]
// 구현된 것이 전혀 없는 설계도
// 껍데기(모든 멤버가 public)
// 제일 밖에 노출되어있기 때문에 public

// 추상클래스와 추상메서드의 차이점
// 일반 클래스를 가지고 있는 것 - 추상클래스
// 완전히 아무것도 없는 것 - 인터페이스
// 인스턴스메소드, 생성자, 멤버를 가질 수 없다
// (고로 추상메서드랑 static메서드, 상수, default 메서드 가능) 

// 추상클래스와 추상메서드의 공통점
// 추상 메서드를 가지고 있다 ( 미완성 설계도 )

// intferface 인터페이스이름 {
//     public static final 타입 상수이름 = 값;-> 상수 O , 변수 X
//     public abstract 메서드이름(매개변수목록) -> 추상메서드(핵심)
//    모든 인터페이스 멤버는 public, abstract추상메서드
// }

// 인터페이스의 조상은 인터페이스만 가능!
// 다중 상속이 가능 (추상메서드는 충돌해도 문제없음)

// 인터페이스의 구현 
// 인터페이스에 정의된 추상 메서드를 완성하는 것 - 미완성 설계도 완성하기
// class 클래스 이름 implements 인터페이스 이름 {
    // 인터페이스에 정의된 추상메서드를 모두 구현해야 함
// }

// 추상클래스
// interface Fightable extends Movable, Attackable{}
// interface Movable {
//     void move(int x, int y);
// }
// interface Attackable {
//     void attack(Unit u);
// }
// 인터페이스 구현

// interface Fightable {
//     void move(int x, int y);
//     void attack(Unit u);
// }
// Fighter클래스는 fightable 인터페이스를 구현했다

// class Fighter implements Fightable {
//     void move(int x, int y){};
//     @Override
//     public void attack(Unit u) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'attack'");
//     };
// }

// 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함
// abstract class Fighter implements Fightable {
//     void move(int x, int y){};
// }
interface PlayingCard{
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;
    // public static final 항상 예외없이 있기때문에 생략가능

    public abstract String getCardNumber();
    String getCardKind();
    // public abstract 생략가능
}

public class InterFace {
    public static void main(String[] args) {
        
    }
}

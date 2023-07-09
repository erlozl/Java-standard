package javaStandard;

// instanceof 연산자 ( 조상 ㅡ> <ㅡ 자손 )
// 참조변수의 형변환 가능 여부 확인에 사용 , 가능하면 true 반환
// 반드시 형변환 전에 확인하기!

// * 형변환을 하는 이유는
// 인스턴스의 원래 기능을 모두 사용하려고

// object(객체) instanceOf type(타입클래스)
// 1) 자기자신의 클래스 객체인가
// 2) 자식클래스의 객체인가 확인하기 위해 사용합니다.

// 자기자신의 클래스 객체인가
// 자식클래스의 객체인가 확인하기 위해 사용합니다.
class Car {

}

class FireEngine extends Car {

}

public class InstanceOfEx {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        System.out.println(fe instanceof Object); // 조상, true => fe 가 가르키는 객체가 object냐?
        Object obj = (Object) fe;
        System.out.println(fe instanceof Car); // 조상, true
        Car c = (Car) fe;
        System.out.println(fe instanceof FireEngine); // true

        // 상속계층도에서 타입클래스가 조상과 자기 자신이면 다 true

    }
}

package javaStandard;

// Object클래스에는 equals()메서드가 이미 정의되어 있다
// Value 클래스에서 equals 메서드를 정의하지 않고 그대로 사용하면,
// 상속된 Object클래스의 equals() 메서드가 호출된다
class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // 자바에서는 모든 객체를 Object 타입으로 다룰 수 있음
    // 모든 클래스의 인스턴스를 가질 수 있다
    // 모든 객체는 Object 클래스의 하위 클래스

    // 서로 다른 객체라도 값이 같으면 참의 결과를 얻고 싶을 땐
    // 형변환해서 value라는 값을 가지고 비교해주기

    // Objcet의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    public boolean equals(Object obj) {
        // 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
        if (!(obj instanceof Value))
            return false;
        // obj가 Value 클래스의 인스턴스인지 확인하는 구문

        Value v = (Value) obj; // obj를 value로 형변환
        // obj가 Object타입이므로 v값을 참조하기 위해서는
        // 자식타입으로 명시적 형변환이 필요하다
        return this.value == v.value;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        // Object 클래스 - 모든 클래스의 최고 조상
        // euqals(Object obj)
        // 객체 자신과 주어진 객체를 비교한다.
        // 객체 주소 비교 (참조변수 값 비교)
        // 서로 다른 두 객체는 항상 주소가 다름

        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다");
        } else {
            System.out.println("v1과 v2는 다릅니다");
        }
    }
}

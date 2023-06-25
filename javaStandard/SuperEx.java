package javaStandard;

// 클래스 영역에 선언된 변수 iv 인스턴스 변수
// 메서드 영역에 선언된 변수 lv 지역변수
// 클래스변수 cv : iv 앞에 static을 붙였을 때

// 참조변수 this, super
// 객체 자신을 가리키는 특수한 참조변수 this
// 현재 객체의 부모 클래스를 참조하는 참조 변수 super
// 인스턴스 메서드(생성자)내에서만 존재, static메서드에 사용불가
// 조상의 멤버를 자신의 멤버와 구별할 때 사용 super

// super() - 조상의 생성자
// 조상의 생성자를 호출할 때 사용
// 조상의 멤버는 조상의 생성자를 호출해서 초기화

// 생성자 초기화블럭은 상속 X 
// 생성자의 첫 줄에 반드시 생성자를 호출해야 한다
// 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super()를 삽입

// this()
// 동일한 클래스 내의 다른 생성자를 호출하기 위해 사용.
// 생성자 체이닝을 구현하는데 사용
class SuperPoint extends Object {
    int x, y;

    // 기본 생성자 작성 필수

    SuperPoint(int x, int y) {
        super(); // 생략가능, 컴파일러가 자동 호출
        this.x = x;
        this.y = y;
    }
}
// class SPoint extends SuperPoint {
// int z;

// SPoint(int x, int y, int z) { 조상의 멤버를 초기화하면 오류
// this.x = x; //
// this.y = y;
// this.z = z;
// }

// }
class SPoint extends SuperPoint {
    int z;

    SPoint(int x, int y) {
        super(x, y); // 조상 클래스의 생성자를 호출
        this.z = z; // 자신의 멤버를 초기화
    }

}

public class SuperEx {
    public static void main(String[] args) {

    }
}

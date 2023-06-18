package javaStandard;
// 상속
// 기존의 클래스로 새로운 클래스를 작성하는 것
// 코드의 재사용

// 두 클래스를 부모와 자식으로 관계 맺어주는 것
// class 자식클래스 extends 부모클래스 {

// }

// 자손은 조상의 모든 멤버를 상속받는다
// 생성자 초기화 블럭 제외
// 자손의 멤버 개수는 조상보다 적을 수 없다
// (같거나 많다)
// 자손의 변경은 조상에 영향을 미치지 않는다
class Parent {
    int age;
}
class Child extends Parent {
    void play () {
        System.out.println("shfwk");
    }
}
public class Inherit {
    public static void main(String[] args) {
        Parent child = new Child();
        System.out.println(child.age = 1); 

    }
}

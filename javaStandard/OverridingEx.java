package javaStandard;

// 오버라이딩(overriding)
// 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

// 오버라이딩의 조건
// 선언부(반환타입,메서드이름,매개변수 목록)는 변경 불가, 내용만 변경가능(구현부)
// 접근 제어자를 조상 클래스의 메서보드 좁은 범위로 변경할 수 없다
// 예외는 조상클래스의 메서드보다 많이 선언할 수 없다

// 상속받은 메서드를 그대로 사용하기도 하지만,
// 자손 클래스 자신에 맞게 변경해야 하는 경우가 많은데,
// 이럴 때 조상의 메서드를 오버라이딩이라고 함

// 오버로딩과 오버라이딩의 관계
// 오버로딩 - 기존에 없는 새로운 메서드를 정의하는 것(new), 상속관계 X
// 오버라이딩 - 상속받은 메서드의 내용을 변경하는 것(change,modify), 상속관계 O

class MyPoint {
    int x;
    int y;

    // String getLocation() {
    public String toString() {
        return "x =" + x + " y = " + y;
    }
}

class Point3D extends MyPoint {
    int z;

    // String getLocation() {
    public String toString() {
        // Object클래스의 toString()을 오버라이딩
        return "x =" + x + " y = " + y + "z = " + z;
    }
}

public class OverridingEx {
    public static void main(String[] args) {

        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        // System.out.println(p.getLocation());
        System.out.println("p.x=" + p.x);
        System.out.println(p.toString());
        System.out.println(p);
        // object는 다 생략가능

    }
}

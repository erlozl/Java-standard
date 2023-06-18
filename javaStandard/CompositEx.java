package javaStandard;

// 상속 관계 ~은 ~이다
// 포함 관계 ~은 ~을 가지고 있다
class Point {
    int x;
    int y;
}

// class Circle extends Point { // 상속
// int z;
// }

class Circle {
    Point p = new Point(); // 참조변수의 초기화
    int z;
}

public class CompositEx {
    public static void main(String[] args) {
        // composite 클래스의 멤버로 참조변수로 선언하는 것
        // 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만든다
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.z = 3;
        // System.out.println("c.x= " + c.x + ", c.y= " + c.y + ",c.z = " + c.z);
        System.out.println("c.p.x= " + c.p.x + ", c.p.y= " + c.p.y + ",c.z = " + c.z);

    }
}

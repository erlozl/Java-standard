package javaStandard;

// 내부클래스의 제어자와 접근성
// 내부 클래스의 제어자는 변수에 사용가능한 제어자와 동일

// 인스턴스 멤버 ㅡ> 스테틱 멤버 O
// 스테틱멤버 ㅡ> 인스턴스 멤버 X

// 내부클래스 사용방법
class Outer2 {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }

}

public class InnerClass02 {
    public static void main(String[] args) {
        Outer2 oc = new Outer2();
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv :" + ii.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);

        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv :" + si.iv);
    }
}

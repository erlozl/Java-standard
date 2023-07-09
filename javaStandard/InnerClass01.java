package javaStandard;

// 내부 클래스 -> 클래스 안의 클래스
// 장점 
// 1. 내부 클래스에서 외부 클래스의 멤버들 쉽게 접근 가능
// ex) 
// class A {}
// class B{
//     여기서 A의 객체를 생성해야 가능
// }
// ex) 
// class A{ 외부클래스
//     class B{
//         내부클래스
//         객체 생성없이도 A의 멤버접근 가능
//     }
// }
// 2. 코드의 복잡성을 줄일 수 있다. (캡슐화)

// 내부 클래스 특징
// 내부 클래스의 종류와 유효범위는 변수와 동일

class A {
    int i = 100;
    B b = new B();
}

class B {
    void method() {
        A a = new A();
        System.out.println(a.i);
    }
}

class C {
    B b = new B();
}

// 내부클래스

class AA {
    int i = 100;
    BB b = new BB();

    class BB {
        void method() {
            // AA a = new AA();
            // System.out.println(a.i);
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근 가능
        }
    }
}

class CC {
    // BB bb = new BB();
}

public class InnerClass01 {
    public static void main(String[] args) {
        B b = new B();
        b.method();

        // BB bb = new BB();
        // b.method();

    }
}

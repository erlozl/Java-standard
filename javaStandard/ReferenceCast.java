package javaStandard;
// 참조변수의 형변환

// - 사용할 수 있는 멤버의 갯수를 조절하는 것
// - 조상 자손 관계의 참조변수는 서로 형변환 가능

// FireEngine f = new FireEngine();
// Car c = (Car)f; // OK. 조상인 Car타입으로 형변환(생략가능) -> 업캐스팅
// FireEngine f2 = (FireEngine)c; // OK. 자손인 FireEngine타입으로 형변환(생략불가) -> 다운캐스팅
// Ambulance a = (Ambulance)f; // 에러 . 상속관계가 아닌 클래스 간의 형변환 불가

// 타입이 안 맞으면 맞춰주면 됨
// ----------------------------------------------------
// Car car = null;
// FireEngine fe = null;

// FireEngine fe2 =(FireEngine) car; 조상 -> 자손으로 형변환
// Car car2 = (Car)fe2; 자손 -> 조상으로 형변환
// car2.drive();

// 객체가 없어도 형변환에는 아무런 문제가 없다
// 근데 실행하면 오류

// 참조 변수가 가리키는 실제객체가 중요!
// 그 멤버의 개수를 넘어서면 안됨 !
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat says meow.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog says woof.");
    }
}

public class ReferenceCast {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 업캐스팅
        // 다형성을 활용하여 부모 클래스 타입으로 자식 클래스의 인스턴스를 다루는 것을 의미
        // 자식 클래스의 인스턴스를 부모 클래스 타입으로 다룰 수 있다

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // 다운캐스팅
            // 부모 클래스인 Animal 변수를 자식 클래스인 Cat 변수로 형변환하는 것을 의미
            // 다운 캐스팅을 하면 부모가 자식의 메서드의 접근할 수 있다
            cat.meow(); // 다운캐스팅 후 Cat 클래스의 메서드 호출

        } else {
            System.out.println("Animal is not a Cat.");
        }
        // animal 변수가 Cat 클래스의 인스턴스인지 instanceof 연산자를 사용하여 확인한 후, 다운캐스팅을 시도합니다.
        // animal 변수는 Dog 클래스의 인스턴스이므로 Cat 클래스로의 형변환은 불가능합니다.
        // 따라서 else 블록이 실행되어 "Animal is not a Cat."이 출력
    }
}

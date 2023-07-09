package javaStandard;
// 매개변수의 다형성

// 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 or 자손타입의 인스턴스를 넘겨줄 수 있다
class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "computer";
    }
}

public class PolyParameter {
    public static void main(String[] args) {

    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다");
    }

    public static void main(String[] args) {
        Buyer b = new Buyer();

        // Product p = new Tv1();
        // b.buy(p);
        b.buy(new Tv1()); // b.buy(Product p)
        // 상속받아서 이렇게 바로 쓰는 것이 가능

        b.buy(new Computer());

        System.out.println("현재 남은 돈은" + b.money + "만원입니다");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
    }
}

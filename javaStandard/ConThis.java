package javaStandard;
    // this ()
    // 생성자에서 다른 생성자 호출할 때 사용
    // 다른 생성자 호출시 첫 줄에서만 사용가능
class Car2 {
    String color;
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door;

    // 코드의 중복을 제거한 코드
    Car2() {
        // this 생성자
        this("white","auto",4);
        // 디폴트 값 지정
    }
    Car2(String color, String gearType, int door) {
        // this 참조 변수 = 인스턴스 자신을 가리킨다
        // 인스턴스 메서드에서 사용가능
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class ConThis {
    public static void main(String[] args) {

        Car2 car2 = new Car2();
        System.out.println(car2.color);
        car2.color = "black";
        System.out.println(car2.color);
    }
}

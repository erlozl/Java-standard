package javaStandard;

class Person {
    int id;

    public boolean equals(Object obj) {
        // if(!(obj instanceof Person)) {
        // return false;
        // } 이렇게 바꿀 수 있음
        // Person객체가 아니면 비교할 필요가 없다는 것

        if (obj instanceof Person) {
            return this.id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    Person(int id) {
        this.id = id;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Person p1 = new Person(8011);
        Person p2 = new Person(8011);

        if (p1.equals(p2)) {
            System.out.println("p1과 p2는 같은 사람입니다");
        } else {
            System.out.println("p1과 p2는 다른 사람입니다");
        }
    }
}

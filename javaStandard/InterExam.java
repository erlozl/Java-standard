package javaStandard;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop () {
        System.out.println("멈춥니다 ");
    }

}
interface Fightable {
    public void move (int x, int y);
    void attack(Fightable f);
}
class Fighter extends Unit2 implements Fightable {
    // 오버라이딩 규칙 : 조상 public보다 접근제어자가 좁으면 안된다
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }
    public void stop() {
        System.out.println("멈춰");
    }
    // 싸울 수 있는 상대를 불러온다

    // 이 인터페이스를 구현한 타입을 반환한다
    Fightable getFightable() {
        Fighter f = new Fighter(); // Fighter를 생성해서 반환
        // Fightable f = (Fightable)new Fighter(); // 
        // 자손을 조상을 가리킬 때는 생략 가능
        return (Fightable)f;

    }


}
public class InterExam {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f3 = f.getFightable();
        Unit2 u = new Fighter();
        Fightable ff = new Fighter();
        f.move(100,200);
        // u.attack(new Fighter()); Unit2에는 attack()이 없어서 호출불가
        // f.attack(new Fighter());
        Fighter f2 = new Fighter();
        f.attack(f2);
        ff.attack(f2);
        // ff.stop(); Fightable에는 stop() 이 없어서 호출불가
    }
}

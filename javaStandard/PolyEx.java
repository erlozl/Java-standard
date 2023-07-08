package javaStandard;

// 다형성 - 여러가지 형태를 가질 수 있는 능력
// 조상 타입 참조 변수로 자손 타입 객체를 다루는 것

// 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
// 부모가 자식의 메서드와 변수는 사용할 수 없다
// tv t = new SmartTv(); // 허용 
// SmartTv s = new Tv(); // 에러
public class PolyEx {
    public static void main(String[] args) {
        // ex) 조상 5개 < 자손 7개 OK
        // ex) 조상 7개 > 자손 5개 NO
        // 실제로 사용할 수 있는 건 5개인데 호출할 수 있는 게 7개면 안된다

        // 참조변수가 조상타입일 때와 자손타입일 때의 차이
        // - 참조변수로 사용할 수 있는 멤버의 갯수가 달라진다
    }
}
package javaStandard;
// 생성자
        // 인스턴스가 생성될 때마다 호출되는 
        // 인스턴스 초기화 메서드 = 대입문
        // 인스턴스 생성시 수행할 작업(초기화)에 사용

        // Time t = new Time();
        // t.hour = 12;
        // t.minute = 34;
        // 번거로움
        // 객체에다가 내가 원하는 값을 세팅한 것 = 초기화

        // Time t = new Time (12,34,56);
        // 직관적이고 편리함
        // 생성자 호출 -> 생성자를 사용했다는 뜻

        // 생성자의 이름이 클래스 이름과 같아야 한다
        // 리턴값이 없다 (void 안붙인다) = 항상 반환값이 없어서
        // 모든 클래스는 반드시 생성자를 가져야 한다
        // 생성자 오버로딩
        // class Card {
        //     Card() {
        //         매개변수 없는 생성자
        //     }
        //     Card(String kind,int number) {
        //         매개변수 있는 생성자
        //     }

        // }

class ConData {
    int value;

    // 생성자 0개이기때문에 기본 생성자 자동추가
}
class ConData2 {
    int value;

    ConData2() {
    }
    // 생성자가 하나라도 있을 경우 기본 생성자는
    // 내가 추가해주기
    ConData2(int x) {
        value = x;
    }
}
    
public class Construc {
    public static void main(String[] args) {
        ConData con = new ConData();
        ConData2 con2 = new ConData2();
        // 기본 생성자 추가 안해주면 컴파일 오류
    }
}

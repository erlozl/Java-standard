package javaStandard;
// 지역변수는 수동 초기화 해야 함
// 멤버 변수는 자동 초기화된다

// 참조형 변수는 객체주소를 넣어주는 게 초기화
// null 값도 초기화가 맞지만 객체를 생성해서 넣어주는 게 맞다

class InitTest {
    static int x;
    int y = x;
    // 명시적(간단)초기화
    void method1() {
        int x = 3;
        // int j=i; 
    }
    static {
        x = 2;
    } // 클래스 초기화 블럭
    static { 
        x=3;
    }
    {
        y = 2;
    } // 인스턴스 초기화 블럭


}
// static 초기화 먼저
// 그 다음 두번째가 인스턴스 초기화
// 자동 0 > 간단  = > 복잡 {}
class StaticBlockTest {
    static int[] arr = new int[0]; // 명시적 초기화
    static {
        for(int i=0; i<arr.length;i++) {
            arr[i] = (int)(Math.random()*10)+1;
        }
    } //복잡 초기화
}
// 멤버 변수의 초기화
// 클래스 변수 초기화 시점 - 클래스가 처음 로딩될 때(메모리에 올라갈 때) 단 한번
// 인스턴스 변수 - 인스턴스가 생성될 때마다
public class VarReset {
    public static void main(String[] args) {
        
    }
}

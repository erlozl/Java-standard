package javaStandard;

// 타입 무조건 일치
class Test {
    void printGugudan(int dan) {
        if(!(2<=dan && dan <=9)) 
            return; // 입력받은 단(dan)이 2~9가 아니면, 
            // 메서드 종료하고 돌아가기
        for(int i=2; i<=9; i++) {
            System.out.println(dan * i);
        }
        return; // 생략가능
    }
}
public class Return {
    public static void main(String[] args) {
        // return문
        // 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다
        Test test = new Test();
        test.printGugudan(1);
    }

    // int max(int a, int b) {
    //     if(a>b) {
    //         return a;
    //     } else {
            // return b;
    //     }
    // } 조건식이 참일 때나 거짓일 때나 return문 적어주기
}

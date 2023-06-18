package javaStandard;

public class Method {
    public static void main(String[] args) {
        // 메서드란 -> 문장들을 묶어놓은 것
        // 작업단위로 문장들을 묶어서 이름 붙인 것
        // 값(입력)을 받아서 처리하고, 결과를 반환(출력)

        // 메서드는 클래스안에 있어야 함

        // 메서드의 작성
        // 반복적으로 수행되는 여러 문장을 메서드로 작성

        // 하나의 메서드는 한 가지 기능만 수행하도록 작성

        // 메서드 = 선언부 + 구현부
        // 반환타입 메서드 이름(타입 변수명 ,타입 변수명, ) {
        //     메서드 호출시 수행될 코드
        // }

        // 반환할 값이 없을 때는 void를 사용

        // 메서드 내에 선언된 변수를 지역변수
        // int add (int x, int y) {
        //     int result = x + y;
        //     return result;
        // } x, y result < 지역변수

        // 메서드 영역안에서 사용되는 변수이기 때문에
        // 이름이 같아도 상관없다 - 겹치지 않음

        // 메서드의 호출 - 메서드 이름(값1, 값2)
        // 작업에 필요한 값들 적어준다 
        
        // int add(int x, int y)
        // 출력        입력
        // 나는 add 메서드인데 작업하려면 x,y의 값이 필요해

        ;
        // 매개체 역할을 한다고 해서 매개변수
        // int add(int x, int y) {
            //     int result = x+y;
            //     return result;
        // }
        
        // int result = add(3,5);
        // 이 3,5를 x, y의 대입을 한 그 결과 값을
        // result에 담은 후 반환 < 값 8 만 담긴 채 
        

    }
}

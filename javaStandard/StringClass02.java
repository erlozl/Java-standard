package javaStandard;

public class StringClass02 {
    public static void main(String[] args) {
        // 문자열을 다루기 위한 클래스
        // String클래스 = 데이터(char[] 문자배열) + 메서드(문자열 관련)

        // 내용을 변경할 수 없는 불변(immutable) 클래스

        // 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐
        // 문자열의 결합이나 변경이 잦다면, 내용 변경가능한 StringBuffer사용

        String string1 = "abc";
        String string2 = "abc";
        // 문자열 리터럴로 문자를 만들면 공유

        String string3 = new String("abc");
        String string4 = new String("abc");
        // 항상 새로운 객체 만들어짐

        // 문자열이 같고 다름을 비교할 때에는 대입연산자는 사용하지 말자
        // equals() 사용 하자 - 내용 비교
        // 대입 연산자는 - 주소 비교

        // 빈 문자열("", empty string)
        // 내용이 없는 문자열, 크기가 0인 char형 배열을 저장하는 문자열

        // 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
        char[] chArr = new char[0]; // 길이가 0인 char배열
        int[] inArr = {}; // 길이가 0인 int배열

    }
}

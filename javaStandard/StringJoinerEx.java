package javaStandard;

public class StringJoinerEx {
    public static void main(String[] args) {
        // join()은 여러 문자열 사이에 구분자를 넣어서 결합

        String animals = "dog,cat,bear";
        String[] splitArr = animals.split(",");
        String joinerArr = String.join("-", splitArr);
        System.out.println(joinerArr);

        // 문자열과 기본형간의 변환

        // 숫자를 문자열로 바꾸는 방법
        // int i = 100;
        // String str1 = i + ""; - 편리
        // String str2 = String.valueOf(i); - 속도 up

        // 문자열을 숫자로 바꾸는 방법
        // int i = Integer.parseInt("100"); // 옛날방법
        // int i2 = Integer.valueOf("100"); // 요즘 방법
        // 원래 반환 타입은 integer지만 기본형 사용 가능

        int iVal = 100;
        String strVal = iVal + "";

        double dVal = 200.0;
        String strVal2 = dVal + "";
        double sum = Integer.valueOf("+" + strVal) + Double.valueOf(strVal2);
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);

    }
}

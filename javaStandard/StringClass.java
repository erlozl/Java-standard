package javaStandard;

import java.util.Arrays;
import java.util.Calendar;

public class StringClass {
    public static void main(String[] args) {
        // String클래스
        // charAt(int index)
        // 지정된 인덱스에 있는 문자를 반환

        // compareTo(String anotherString)
        // 사전적순서

        // concat(String str)
        // 주어진 문자열을 현재의 문자열 뒤에 붙인다

        // equals(Object anObject)
        // 주어진 객체와 현재의 문자열을 비교한다

        // isEmpty()
        // length()가 0이면 ture를 반환

        // toLowerCase() 소문자
        // toUpperCase() 대문자

        String s = "Hello World";
        System.out.println(s);
        int size = s.length();
        System.out.println(size);

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");

        if (s1.equals(s2)) {
            System.out.println("true");
        }
        if (s3.equals(s4)) {
            System.out.println("true");
        }

        String letter = "The cat is on the table";
        int letterValue = letter.indexOf("table");
        System.out.println(letterValue); // 시작 위치 반환

        if (letterValue == -1) {
            System.out.println("반환위치 X");
        } else {
            System.out.println(letterValue);
        }

        // split
        String[] tokens = "I am a girl".split(" ");
        for (String tokenArray : tokens) {
            System.out.println(tokenArray);
        }
        String[] tokens2 = "100,200,300".split(",");
        for (String tokens2Array : tokens2) {
            System.out.println(tokens2Array);
        }

        // String 객체는 불변성을 가진 객체 - 한번 만들어지면 변경되지 않는 객체

        // 변경 가능한 문자열 StringBuffer
        StringBuffer sb = new StringBuffer("Happiness depends upoon ourselves");
        sb.append(10 - 20); //
        sb.insert(3, "왈");
        System.out.println(sb);

        int num = (int) (Math.random() * 6) + 1;
        System.out.println(num);

        int[] arr = { 0, 1, 4, 6, 3, 2 };
        Arrays.sort(arr);
        for (int arrs : arr) {
            System.out.println(arrs);
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(arr, 7)); // 인덱스를 반환 5
        Arrays.fill(arr, 9);
        for (int arrs2 : arr) {
            System.out.println(arrs2);
        }

        // Calendar클래스
        Calendar d = Calendar.getInstance();
        System.out.println(d);
        System.out.println(d.get(Calendar.YEAR) + "년");
        System.out.println(d.get(Calendar.MONTH) + "월"); // 월은 0부터 시작함
        System.out.println(d.get(Calendar.DATE) + "일");
        d.set(Calendar.HOUR, 10);
        d.set(Calendar.MINUTE, 51);
        d.set(Calendar.SECOND, 12);
        System.out.println(d);
    }
}

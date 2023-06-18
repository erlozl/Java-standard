package javaStandard;

class Data {
    int x;

    int change(int x) {
        this.x = 1000;
        int result = x;
        return result;
    }
 }
public class BasicPara {
    public static void main(String[] args) {
        // 기본형 매개변수 - 변수의 값을 읽기만 할 수 있다
        // 참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다 

        Data data = new Data();
        data.x = 10;

        System.out.println(data.change(data.x));


    }
}

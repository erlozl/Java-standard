package javaStandard;

class Data2 {
    int x;

    int change (Data2 d) {
        d.x = 1000;
        int result = d.x;
        return result;
    }
}
// 참조형 반환타입
class Data3 {
    int value;

    public Data3(int value) {
        this.value = value;
    } 

    Data3 multiply(int multiplier) {
        int result = this.value * multiplier;
        return new Data3(result);
    }
    
}
public class ReferPara {
    public static void main(String[] args) {
        // 참조형 매개변수
    
        Data2 data2 = new Data2();
        data2.x = 10;

        System.out.println(data2.change(data2));

        Data3 data3 = new Data3(5);
        Data3 multipliedData = data3.multiply(3);

        System.out.println(multipliedData.value);

    }
}

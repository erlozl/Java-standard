package javaStandard;

// 상속을 하게 되면
// 부모타입은 자식 객체에 있는 메소드나 변수를 참조할 수 없다

// 부모 타입으로 자식 객체를 참조하는 경우, 
// 부모 클래스에 정의된 멤버만 직접적으로 접근할 수 있습니다. 

// 오버라이딩을 통해서 접근 가능
class Television {
    boolean power;
    int channel;

    void power() {
        power =!power;
    }
     void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
class SmartTv extends Television {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
public class InherItExam {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        Television tv2 = new SmartTv();
        tv.channel = 10;
        tv.channelUp();
        System.out.println(tv.channel);
        tv.displayCaption("Hi");
        tv.caption = true;
        tv.displayCaption("Hi");
        // tv2.caption = true;
        // tv2.displayCaption("Hi"); 오류
    }
}

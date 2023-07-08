package javaStandard;

// 캡슐화와 접근 제어자 - 접근제어자의 범위는 좁을수록 좋다
// 접근 제어자 사용이유 -> 1) 데이터가 잘못된 데이터가 되는 걸 막으려고
//   2) 내부적으로만 사용되는, 부분을 감추려고

// 인스턴스 변수 외부에서 접근하지 못하도록 변수 막기
// 메서드는 public으로 해서 외부에서 접근하도록 하기

// 직접 접근은 막고
// 메서드를 통한 간접접근 허용
// 왜 ? 변수의 값이 안 바뀌게 하기 위함 = 값 보호하기
class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isValidHour(hour))
            return;
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int gethour() {
        return hour;
    }
}

public class Capsule {
    public static void main(String[] args) {
        Time t = new Time();
        // t.hour = 25;
        t.setHour(21);
        System.out.println(t.gethour());
    }
}

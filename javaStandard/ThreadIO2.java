package javaStandard;

import javax.swing.JOptionPane;

// 멀티스레드
class ThreadIO3 extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}

public class ThreadIO2 {
    public static void main(String[] args) {
        ThreadIO3 io1 = new ThreadIO3();
        io1.start();
        // 스레드가 시작되는 순간부터 출력을 수행하므로
        // "입력하신 값은 xxx입니다" 메시지가 출력되기 전에 숫자가 출력될 수 있습니다.

        // 일반적으로 스레드를 먼저 실행시킨 후 블로킹(입출력)되는 작업을 수행하는 것이 좋다
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        // 사용자로부터 입력을 기다리는 구간, 아무일도 하지 않음
        System.out.println("입력하신 값은" + input + "입니다");

    }
}

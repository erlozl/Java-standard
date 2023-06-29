package javaStandard;

import javax.swing.JOptionPane;

// 입출력시 작업 중단 - I/O블락킹
public class ThreadIO {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
        // 사용자로부터 입력을 기다리는 구간, 아무일도 하지 않음
        System.out.println("입력하신 값은" + input + "입니다");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

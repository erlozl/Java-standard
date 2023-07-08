package javaStandard;

public class Thread01 {
    /*
     * 자바는 CPU가 하나의 스레드를 생성하여 실행한다
     * 실 == main 메서드 ( 실이 짧으면 종료)
     * 
     */
    public static void main(String[] args) {
        // main스레드가 새로운 스레드를 생성

        // Thread 두개 -> main Thread, new Thread
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브 쓰레드" + i);
                try {
                    Thread.sleep(1000);
                    // 메인 쓰레드를 1초 잠깐 쉬었다가 실행
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 타켓 - 쓰레드의 길이
        }).start(); // start는 내부 실행
        // Thread를 시작하는 것
        // 실을 만드는 것

        for (int i = 0; i < 5; i++) {
            System.out.println("메인 쓰레드" + i);
            try {
                Thread.sleep(1000);
                // 메인 쓰레드를 1초 잠깐 쉬었다가 실행
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

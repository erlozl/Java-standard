package javaStandard;

// 별도의 스레드로 따로 돌리면 섞인다 (섞이는 게 다름)
// 번갈아가면서 실행된다
class ThreadEx1 extends Thread {
    @Override
    public void run() { // 쓰레드가 수행할 작업을 작성
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + 0);
        }
    }
}

class ThreadEx2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + 1);
            // Runnable로 getName에 접근할 때는 Thread.currentThread(); 메서드 이용해서 스레드객체 참조해야 함
        }
    }

}

public class Thread02 {
    public static void main(String[] args) {
        // Thread클래스를 상속 - 자바는 단일 상속
        // class MyThread extends Thread {
        // public void run() { Thread클래스의 run() 오버라이딩
        // }
        // }
        // MyThread t1 = new MyThread(); // 쓰레드 생성
        // t1.start(); // 쓰레드 구현

        // *best*
        // Thread클래스를 Runnable 인터페이스를 구현
        // class MyThread2 implements Runnable {
        // public void run() { Runnable 인터페이스 추상메서드 run()을 구현
        // }
        // }
        // Runnable r = new MyThread2();
        // Thread t2 = new Thread(r);
        // Thread t2 = new Thread(new MyThread2()); 한 줄로 요약
        // t2.start();
        ThreadEx1 t1 = new ThreadEx1();
        Thread t2 = new Thread(new ThreadEx2());
        t1.start();
        t2.start();
        // t1이 먼저 실행시켰다고 바로 스레드가 실행 되는 것이 아님
        // 그냥 실행 가능한 상태가 되는거임 - 언제 실행될지는 OS의 스케줄러가 실행 순서를 결정함

    }
}

package javaStandard;

// main 쓰레드
// main 메서드의 코드를 수행하는 쓰레드

// OS스케줄러의 알고리즘에 따라
// 어떤 스레드가 얼마의 시간동안 실행될지에 따라
// 실행될 때마다 달라짐
// 많은 스레드와 프로세스가 돌아가기 때문에 그 상황이 달라짐
// 어떤 특정 프로세스를 위해서만 작업을 하지 않기 때문에 공평해야 함
// 그래서 매번 모든 프로세스의 스레드의 상황을 고려해서
// 적절한 판단을 내려서 스케줄링을 함
// 우리가 작성한 스레드가 작성한 시간과 순서를 결정할 수 없음
// 우리가 제어할 수 없다

class Thread01 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("ㅡ"));
        }
        super.run();
    }

}

class Thread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
        super.run();
        // run() 메서드는 쓰레드가 독립적으로 실행되는 별도의 실행 경로에서 실행
    }
}

public class ThreadEx {
    static long startTime = 0;

    public static void main(String[] args) {
        Thread01 th1 = new Thread01();
        Thread02 th2 = new Thread02();
        th1.start();
        // start() 메서드는 쓰레드의 실행을 시작시키는 역할
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join(); // main 스레드가 th1의 작업이 끝날 때까지 기다린다
            th2.join(); // main스레드가 th2의 작업이 끝날 때까지 기다린다
        } catch (Exception e) {
        }
        System.out.println("소요시간" + (System.currentTimeMillis() - startTime));
    }
}

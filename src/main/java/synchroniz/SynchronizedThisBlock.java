package synchroniz;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SynchronizedThisBlock {
    public static void main(String[] args) {
        SynchronizedThisBlock synchronizedThisBlock = new SynchronizedThisBlock();

        Thread thread1 = new Thread(() -> {
            System.out.println("스레드1 시작 " + LocalDateTime.now());
            synchronizedThisBlock.syncBlockMethod1("스레드1");
            System.out.println("스레드1 종료 " + LocalDateTime.now());
        });

        Thread thread2 = new Thread(() ->{
            System.out.println("스레드2 시작 " + LocalDateTime.now());
            synchronizedThisBlock.syncBlockMethod2("스레드2");
            System.out.println("스레드2 종료 " + LocalDateTime.now());
        });
        thread1.start();
        thread2.start();
    }

    private void syncBlockMethod1(String message) {
        synchronized (this){
            System.out.println(message + "의 syncBlockMethod1 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(message + "의 syncBlockMethod1 실행완료"+ LocalDateTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void syncBlockMethod2(String message) {
        synchronized (this){
            System.out.println(message + "의 syncBlockMethod2 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println(message + "의 syncBlockMethod2 실행완료"+ LocalDateTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

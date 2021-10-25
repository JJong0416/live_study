package thread;

public class ThreadState {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_1());

        t1.start();
        System.out.print("isInterrupted = " + t1.isInterrupted());

        t1.interrupt();
        System.out.print("isInterrupted = " + t1.isInterrupted());
    }

}

class Thread_1 implements Runnable {

    @Override
    public void run() {
        System.out.print("<t1 시작>");
        for (int i = 0; i < 10000; i++) {
            System.out.print("-");
        }
        System.out.print("<t1 종료>");
    }
}
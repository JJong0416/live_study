package thread;

public class ThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadEx1());
        Thread t2 = new Thread(new ThreadEx2());


        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
        }

    }
}

class ThreadEx1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("-");
        }
    }
}

class ThreadEx2 implements Runnable{

    boolean suspend = false;
    boolean stop = false;

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("|");
        }
    }
}

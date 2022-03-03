package multi.thread;

public class Order implements Runnable {
    @Override
    public void run() {
        makeFood();
    }

    public static synchronized void makeFood() {
        while (true) {
            // 주문을 받고 음식을 만들고 있다는 가정 하에
            // 만약 새로운 주문이 들어온다면 먼저 주문이 들어온 음식이 나올 때 까지
            // 새로운 음식은 나올 수가 없다
        }
    }
}

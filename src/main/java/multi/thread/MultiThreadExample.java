package multi.thread;

public class MultiThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread order = new Thread(new Order());
        Thread newOrder = new Thread(new Order());

        order.start();
        newOrder.start();

        Thread.sleep(1000);

        System.out.println(order.getState()); // RUNNABLE
        System.out.println(newOrder.getState()); // BLOCKED
        System.exit(0);
    }
}

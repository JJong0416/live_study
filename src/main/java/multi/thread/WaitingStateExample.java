package multi.thread;

public class WaitingStateExample implements Runnable{

    public static Thread order;

    public static void main(String[] args) {
        order = new Thread(new WaitingStateExample()); // 주문을 받는다.
        order.start(); // 받은 주문을 토대로 음식을 만들기 시작한다.
    }

    @Override
    public void run() {
        Thread orderEdit = new Thread(new OrderEdit()); // 음식을 만드는 와중에 요청사항이 발생했다.
        orderEdit.start(); // 요청사항 대로 조리방법을 변경했다.

        try {
            orderEdit.join(); //
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
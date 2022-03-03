package multi.thread;

class OrderEdit implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("주문한 음식에 요청사항이 생겼을 때");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        // 요청사항에 대해 먼저 처리한다.
        // 요청사항이 끝날 때 까지 기존에 조리하던 음식은 잠시 멈춘 상태로 기다린다.
        System.out.println("기존에 주문은 잠시 : " + WaitingStateExample.order.getState());
    }
}
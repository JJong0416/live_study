//package thread;
//
//public class ThreadDemo {
//
//    public static void main(String[] args) {
//        Thread t1 = Thread.currentThread();
//        System.out.println("currentThread = " + t1);
//
//        Thread t2 = new Thread(new Thread_1());
//        System.out.println("newThread = " + t2);
//    }
//}
//
//class Thread_ex1 implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.print("<t1 시작>");
//        for (int i = 0; i < 50000; i++) {
//            System.out.print("-");
//        }
//        System.out.print("<t1 종료>");
//    }
//}

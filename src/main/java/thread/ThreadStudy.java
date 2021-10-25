package thread;

public class ThreadStudy {

    public static void main(String[] args) {
        /* 상속으로 구현 */
        ThreadByInheritance thread1 = new ThreadByInheritance();

        /* 인터페이스로 구현 */
        Runnable r = new ThreadByImplement();
        Thread thread2 = new Thread(r); // 생성자 타입 : Thread(Runnable target)


        /* Thread thread2 = new Thread(new ThreadByImplement()); 로 축약이 가능 */
        thread1.start();
        thread2.start();

    }
}

class ThreadByInheritance extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 30 ; i++){
            System.out.print(0);
        }
    }
}

class ThreadByImplement implements Runnable {
    @Override
    public void run() {
        for (int i = 0 ; i < 30 ; i++){
            System.out.print(1);
        }
    }
}
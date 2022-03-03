package multi.thread;

public class Wrapping implements Runnable {
    @Override
    public void run() {
        System.out.println("랩으로 쌓고 나왔습니다.");
    }
}

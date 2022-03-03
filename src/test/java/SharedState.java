import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicLong;


public class SharedState {

    private static long startTime = System.currentTimeMillis();
    private static int maxCnt = 1000;
    private static AtomicLong count2 = new AtomicLong();

    @Test
    void threadNotSafe2() throws Exception {
        for (int i = 0; i < maxCnt; i++) {
            new Thread(this::plus2).start();
        }

        Thread.sleep(2000); // 모든 스레드가 종료될때 까지 잠깐 대기
        Assertions.assertEquals(count2.get(),maxCnt);
    }

    public void plus2() {
        if (count2.incrementAndGet() == maxCnt) {
            System.out.println(System.currentTimeMillis() - startTime);
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    }
}

package multi;

public class Synchronized {
    // 메서드 전체에 동기화 적용
    public synchronized void foo() {
        /* critical section */
    }

    // 내부에 동기화 블럭 생성
    public void bar() {
        synchronized (this) {
            /* critical section */
        }
    }

    // 클래스 내부의 전역 메서드에서 동기화 블럭을 생성하는 방법
    public static void syncMethod() {
        synchronized (Synchronized.class) {
            /* critical section */
        }
    }
}

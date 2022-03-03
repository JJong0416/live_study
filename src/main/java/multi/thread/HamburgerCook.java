package multi.thread;

class HamburgerCook implements Runnable {

    private int hamburgerCount;
    private String[] grill = {"_", "_", "_", "_"}; // 그릴판에 최대 4개의 햄버거를 만들 수 있다.

    public HamburgerCook(int count) {
        hamburgerCount = count;
    }

    @Override
    public void run() {
        while (hamburgerCount > 0) {

            synchronized (this) { // 한번에 하나의 쓰레드만 접근할 수 있다.
                hamburgerCount--;
                System.out.println("현재 만들어야 하는 버거의 갯수 : " + hamburgerCount);
            }

            for (int i = 0; i < grill.length; i++) {
                if (!grill[i].equals("_")) {
                    continue;
                }

                synchronized (this) {
                    grill[i] = Thread.currentThread().getName();
                    System.out.println(grill[i] + "버거를 만드는 중 입니다.");
                }

                // 버거를 만드는 데 대략 2초가 걸린다고 가정
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }


                synchronized (this) { // 다 만든 햄버거는 다시 그릴판을 비운다. 이때도 한번에 하나의 쓰레드만 접근할 수 있다.
                    System.out.println(Thread.currentThread().getName() + "버거가 다 만들어졌습니다.");
                    System.out.println("-------------------------------------------------------");
                    grill[i] = "_";
                }
                break;
            }

            // 새로운 버거를 만들기 위한 준비시간
            try {
                Thread.sleep(Math.round(1000 * Math.random()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
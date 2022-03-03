package multi.thread;

public class Mcdonalds {
    public static void main(String[] args) {
        try {
            HamburgerCook hamburger = new HamburgerCook(10);
            new Thread(hamburger, "BicMac").start();
            new Thread(hamburger, "MacChicken").start();
            new Thread(hamburger, "MacSpicy").start();
            new Thread(hamburger, "EggBulgogi").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
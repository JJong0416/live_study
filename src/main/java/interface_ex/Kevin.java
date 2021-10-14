package interface_ex;

public class Kevin extends Person {
    public Kevin(int age) {
        this.age = age;
    }

    @Override
    public void language() {
        System.out.println("I Speak English");
    }
}
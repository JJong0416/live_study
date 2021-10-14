package interface_ex;

public class JongChan extends Person implements SwimAble{

    public JongChan(int age) {
        this.age = age;
    }

    @Override
    public void language() {
        System.out.println("저는 한국어를 사용합니다");
    }

    @Override
    public void swim() {
        System.out.println("개헤엄을 잘 합니다.");
    }
}
package interface_ex;

public class Fish implements SwimAble{

    @Override
    public void swim() {
        System.out.println("나는 헤엄을 엄청 잘한다.");
    }
}
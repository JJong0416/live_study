package gof.strategy;

public class Order {

    public static void main(String[] args) {
        // 커피머신을 만듭니다.
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // 아메리카노를 뽑기 위해서, 아메리카노 버튼만 누르면
        // 아메리카노 전략(레서피)를 넣어 아메리카노를 추출합니다.
        String americano = coffeeMachine.brew(new AmericanoStrategy());
        System.out.println(americano);

        // 라떼를 뽑기 위해서, 라떼 버튼만 누르면
        // 라떼 전략(레서피)를 넣어 라떼를 추출합니다.
        String latte = coffeeMachine.brew(new LatteStrategy());
        System.out.println(latte);

        String greenTea = coffeeMachine.brew(new GreenTeaStrategy());
        System.out.println(greenTea);

    }
}
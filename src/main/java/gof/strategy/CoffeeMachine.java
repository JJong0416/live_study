package gof.strategy;

public class CoffeeMachine {

    public String brew(CoffeeStrategy coffeeStrategy){
        return coffeeStrategy.brew();
    }
}

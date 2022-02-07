package gof.strategy;

public class LatteStrategy implements CoffeeStrategy {

    private final static String LATTE = "카페라떼";

    @Override
    public String brew() {
        return LATTE;
    }
}

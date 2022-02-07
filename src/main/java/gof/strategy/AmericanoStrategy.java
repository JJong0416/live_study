package gof.strategy;

public class AmericanoStrategy implements CoffeeStrategy {

    private final static String AMERICANO = "아메리카노";

    @Override
    public String brew() {
        return AMERICANO;
    }
}

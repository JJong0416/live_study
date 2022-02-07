package gof.strategy;

public class GreenTeaStrategy implements CoffeeStrategy{

    private final static String GREEN_TEA = "녹차";

    @Override
    public String brew() {
        return GREEN_TEA;
    }
}

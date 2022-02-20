package gof.factory.computerExample;

public class ComputerStore {
    public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu) {
        switch (computerType){
            case PC:
                return new PC(ram, hdd, cpu);
            case Server:
                return new Server(ram, hdd, cpu);
            default:
                throw new RuntimeException(computerType + "is not existed");
        }
    }
}

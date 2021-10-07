import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);


        int sum = list.stream()
                .reduce(0, (a,b) -> {
                    System.out.println("a : " + a + "\n b : " + b + "\n" );
                    return a+b;
                });
    }
}

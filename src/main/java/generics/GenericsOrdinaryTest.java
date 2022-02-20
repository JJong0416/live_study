package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsOrdinaryTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("white");
        list.add("ship");
        list.add("study");
        list.add(1);

        for (Object o : list) {
            String str = (String) o;
            System.out.println(str);
        }

        System.out.println("==============");

        List<String> lst = new ArrayList<String>();
        list.add("white");
        list.add("ship");
        list.add("study");
        list.add(1);

        for (String s : lst) {
            System.out.println(s);
        }
    }
}

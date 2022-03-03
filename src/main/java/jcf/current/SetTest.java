package jcf.current;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetTest {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode() + " " + obj1.equals(obj2));
        System.out.println(obj2.hashCode() + " " + obj2.equals(obj1));

        Set<String> hs = new HashSet<>();

        hs.add("hello");
        hs.add("hello");

        for (String h : hs) {
            System.out.println(h);
        }
    }
}

package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_기록 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> ht = new HashMap<>();
        ht.put("a","1");
        ht.put("e","2");
        ht.put("l","3");
        ht.put("o","4");
        ht.put("u","5");

        String[] str = bf.readLine().split("");

        Queue<String> dq = new ArrayDeque<>();
        dq.offer("a");

        for (int i = 0; i < str.length; i++){
            if (ht.containsKey(str[i])){
                dq.add(str[i]);
                dq.add("p");
                dq.add(str[i]);
            }

            else{
                dq.add(str[i]);
            }
        }
        System.out.println(dq.toString());
    }
}

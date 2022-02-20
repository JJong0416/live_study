package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution_백설_공주와_일곱난쟁이 {
    static boolean flag;
    static List<Integer> nan;
    static int[] lst;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nan = new ArrayList<>();
        lst = new int[9];
        flag = false;

        for (int i = 0; i < 9; i++) {
            lst[i] = Integer.parseInt(br.readLine());
        }
        subset(0, 0, 0);
    }

    public static void subset(int idx, int cur_sum, int start) {
        if (flag) {
            return;
        }

        if (idx == 7) {
            if (cur_sum == 100) {
                flag = true;
                for (Integer integer : nan) {
                    System.out.println(integer);
                }
                System.exit(0);
            }
            return;
        }

        for (int a = start; a < 9; a++) {
            nan.add(lst[a]);
            subset(idx + 1, cur_sum + lst[a], a + 1);
            nan.remove(nan.size() - 1);
        }
    }
}


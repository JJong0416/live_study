package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Solution_퍼펙트_셔플 {
    public static int N;
    public static int left;
    public static int right;
    public static int mid;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int tc = 1; tc <= T; ++tc) {
            N = Integer.parseInt(bf.readLine());

            String[] lst = bf.readLine().split(" ");
            Deque<String> dq = new LinkedList<>();

            left = 0;
            right = (N + 1) / 2;
            mid = N / 2;

            for (int i = 0; i < mid; i++) {
                dq.add(lst[left]);
                dq.add(lst[right]);
                left += 1;
                right += 1;
            }

            if (N % 2 == 1) {
                dq.add(lst[mid]);
            }
            StringBuilder sb = new StringBuilder();
            while (!dq.isEmpty()){
                sb.append(" ").append(dq.removeFirst());
            }
            System.out.println("#" + tc + sb.toString());
        }
    }
}

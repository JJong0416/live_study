package ssafy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_요세푸스 {
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> lq = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N + 1; ++i) {
            lq.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (lq.size()>1){
            for (int i = 0; i<M-1; ++i){
                lq.offer(lq.poll());
            }
            sb.append(lq.poll()).append(", ");
        }
        sb.append(lq.poll()).append(">");
        System.out.println(sb);
    }
}
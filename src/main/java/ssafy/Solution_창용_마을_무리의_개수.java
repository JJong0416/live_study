package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_창용_마을_무리의_개수 {
    static int T;
    static int N,M;

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());

        for (int tc = 1; tc < T+1; tc++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            visited = new boolean[N+1];
            data = new ArrayList<ArrayList<Integer>>();
            int cnt = 0;

            for (int i = 0; i < N + 1; i++) {
                data.add(i, new ArrayList<Integer>());
                visited[i] = false;
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                data.get(start).add(end);
                data.get(end).add(start);
            }

            for (int i = 1; i < N + 1; i++) {
                if (!visited[i]){
                    cnt += 1;
                    bfs(i);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(tc).append(" ").append(cnt);
            System.out.println(sb);
        }
    }

    private static void bfs(int start){
        Queue<Integer> dq = new LinkedList<>();
        dq.add(start);
        visited[start] = true;

        while(!dq.isEmpty()){
            int x = dq.poll();

            for (int a = 0; a < data.get(x).size(); a++) {
                if (!visited[data.get(x).get(a)]){
                    dq.add(data.get(x).get(a));
                    visited[data.get(x).get(a)] = true;
                }
            }
        }
    }
}

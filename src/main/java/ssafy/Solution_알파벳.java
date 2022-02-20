package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_알파벳 {

    static int R;
    static int C;
    static int[][] map;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int _max = 0;
    static boolean[] visit = new boolean[26];

    public static void backtrack(int x, int y, int count) {
        if (visit[map[x][y]]) {
            _max = Math.max(_max, count);
            return;

        } else {
            visit[map[x][y]] = true;
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if (cx >= 0 && cy >= 0 && cx < R && cy < C) {
                    backtrack(cx, cy, count + 1);
                }
            }
            visit[map[x][y]] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }

        backtrack(0,0,0);
        System.out.println(_max);
    }
}

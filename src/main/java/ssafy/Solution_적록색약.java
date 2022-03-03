package ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution_적록색약 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static char[][] map;
    static boolean[][] visited;
    static int tot = 0, cnt = 0, n;
    static Queue<dot> q = new ArrayDeque<dot>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            char[] str = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = str[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(new dot(i, j));
                    tot++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'R') {
                    map[i][j] = 'G';
                }
            }
        }

        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(new dot(i, j));
                    cnt++;
                }
            }
        }

        System.out.println(tot + " " + cnt);
    }

    static void bfs(dot d) {
        char color = map[d.x][d.y];
        visited[d.x][d.y] = true;
        q.add(d);


        while (!q.isEmpty()) {
            dot t = q.remove();
            int x = t.x;
            int y = t.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n &&
                        map[nx][ny] == color && !visited[nx][ny]) {
                    q.add(new dot(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}

class dot {
    int x;
    int y;

    public dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
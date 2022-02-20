package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_색종이 {
    static int N;
    static int[][] board = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        int area = 0;

        for (int i = 0; i < 100; ++i) {
            for (int j = 0; j < 100; ++j) {
                board[i][j] = 0;
            }
        }

        for (int i = 0; i < N; ++i) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            x -= 1;
            y -= 1; // 인덱스 조정

            for (int j = 0; j < 10; ++j) {
                for (int k = 0; k < 10; ++k) {
                    if (board[x + j][y + k] == 1) {
                        continue;
                    } else {
                        board[x + j][y + k] = 1;
                        area += 1;
                    }
                }
            }
        }
        System.out.println(area);
    }
}

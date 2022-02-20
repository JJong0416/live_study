package ssafy;

import java.util.Scanner;

public class Solution_Ladder1 {

    static int N = 100;
    static int board[][] = new int[100][100];
    static int visited[][] = new int[100][100];

    public static int solve(int y) {
        int x = N - 1;

        while (x-- != 0) {
            boolean check = false;

            if (y + 1 < N && board[x][y + 1] == 1) {
                check = true;

                while (y + 1 < N && board[x][y + 1] == 1)
                    y++;
            }

            if (!check) {
                while ((y - 1 >= 0) && board[x][y - 1] == 1)
                    y--;
            }
        }
        return y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        visited = new int[100][100];

        for (int tc = 1; tc <= 10; ++tc){
            tc = sc.nextInt();
            int x = 99;
            int y = 0;

            for (int i = 0; i< 100; i++){
                for (int j = 0; j < 100; j++){
                    board[i][j] = sc.nextInt();
                    visited[i][j] = 0;
                    if (board[x][j] == 2){
                        y = j;
                    }
                }
            }
            System.out.println("#"+tc+" "+ solve(y));
        }
    }
}

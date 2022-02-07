package ssafy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_햄버거다이어트 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int idx = 1; idx <= tc; ++idx) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            answer = 0;
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; ++i) {
                st = new StringTokenizer(br.readLine(), " ");
                score[i] = Integer.parseInt(st.nextToken());
                kcal[i] = Integer.parseInt(st.nextToken());
            }

            solve(0, 0, 0);
            System.out.println("#" + idx + " " + answer);
        }
    }

    static int[] score = new int[21];
    static int[] kcal = new int[21];
    static int answer = 0;
    static int n, l;

    static void solve(int idx, int sumIng, int sumKal) {
        if (sumKal > l) {
            return;
        }

        if (answer < sumIng)
            answer = sumIng;

        if (idx == n) {
            return;
        }

        solve(idx + 1, sumIng + score[idx], sumKal + kcal[idx]);
        solve(idx + 1, sumIng, sumKal);
    }
}

/**
 * 1
 * 5 1000
 * 100 200
 * 300 500
 * 250 300
 * 500 1000
 * 400 400
 */
package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_한빈이와_Spot_Mart {
    private static int N, M;
    private static int[] data;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            data =  new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                data[i] = Integer.parseInt(st.nextToken());
            }

            int _max = -1;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (data[i] + data[j] <= M) {
                        _max = Math.max(_max, data[i] + data[j]);
                    }
                }
            }
            System.out.println("#" + tc + " " + _max);
        }
    }
}

/*

4
3 45
20 20 20
6 10
1 2 5 8 9 11
4 100
80 80 60 60
4 20
10 5 10 16
 */
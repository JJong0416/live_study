package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_규영이와_인영이의_카드게임 {
    static int[] KuYoung;
    static int[] InYoung;
    static int[] result;

    static boolean[] visited;
    static int win;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] cards = new int[19];
        int T = Integer.parseInt(bf.readLine());

        for (int tc = 1; tc<= T; ++tc){
            KuYoung = new int[9];
            InYoung = new int[9];

            visited = new boolean[19];

            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            int idx = 0;
            while(st.hasMoreTokens()){
                KuYoung[idx] = Integer.parseInt(st.nextToken());

                idx += 1;
            }
        }
    }
}

package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_냉장고 {

    static int N;
    static int[][] temper;
    static int refre;
    static int _adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Pair[] arr = new Pair[N];

        for (int i = 0; i < N; i++) {
            String[] pair = br.readLine().split(" ");
            arr[i] = new Pair(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
        }

        Arrays.sort(arr);
        refre = arr[0].high;
        _adj = 1;

        for (int i = 1; i < N; i++) {
            if (refre < arr[i].low){
                refre = arr[i].high;
                _adj += 1;
            }
        }
        System.out.print(_adj);
    }
}

class Pair implements Comparable<Pair> {
    int low;
    int high;

    public Pair(int low, int high) {
        this.low = low;
        this.high = high;
    }

    @Override
    public int compareTo(Pair o) {
        return this.high - o.high;
    }
}



package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            int val = Integer.parseInt(br.readLine());

            if (val > max) {
                max = val;
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}

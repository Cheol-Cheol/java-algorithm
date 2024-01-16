package doit.자료구조.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int cnt = 0;

        for (int k = 0; k < N; k++) {
            int target = num[k];
            int lt = 0;
            int rt = N - 1;

            while (lt < rt) {
                int sum = num[lt] + num[rt];

                if (sum == target) {
                    if (lt != k && rt != k) {
                        cnt++;
                        break;
                    }
                } else if (sum < target) {
                    lt++;
                } else {
                    rt--;
                }
            }
        }

        System.out.println(cnt);
    }
}

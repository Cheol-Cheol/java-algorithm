package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int sum = 0;

        xx:
        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue xx;
                }
            }
            if (i <= min) {
                min = i;
            }
            sum += i;
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}

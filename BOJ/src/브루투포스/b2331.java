package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2331 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < N; i++) {

            int originNumber = i;
            int sum = 0;

            // 자릿수 구한 후 분해합 연산
            while (originNumber != 0) {
                sum += originNumber % 10;
                originNumber /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}

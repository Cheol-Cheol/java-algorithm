package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (N == -1) {
                break;
            }

            String result = N + " = 1";
            int sum = 1;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    sum += i;
                    result += " + " + i;
                }
            }

            if (sum != N) {
                System.out.println(N + " is NOT perfect.");
            } else {
                System.out.println(result);
            }
        }
    }
}

package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= N; i++) {
            while (N != 1) {
                if (N % i == 0) {
                    System.out.println(i);
                    N = N / i;
                } else {
                    break;
                }
            }
        }
    }
}

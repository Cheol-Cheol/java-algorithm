package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int res = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (number == 1) {
                continue;
            }

            int cnt = 0;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    cnt++;
                }
            }

            if (cnt == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}

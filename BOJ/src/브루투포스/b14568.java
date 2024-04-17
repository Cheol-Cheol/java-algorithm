package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b14568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int A = 1; A <= N; A++) { // 조건3을 미리 배제하기 위해 1부터 시작해도 되지 않나?
            for (int B = 1; B <= N; B++) {
                for (int C = 1; C <= N; C++) {
                    if (A + B + C == N) {
                        if (C >= B + 2) {
                            if (A % 2 == 0) {
                                answer++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}

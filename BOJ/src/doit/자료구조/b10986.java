package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N]; // 합 배열
        long[] C = new long[M]; // 같은 나머지의 인덱스를 카운트하는 배열
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());

        // 합 배열 초기화
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 합 배열 각각의 요소에 나머지 연산 수행
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);

            // 먼저 0인 요소 카운트
            if (remainder == 0) answer++;

            // 나머지가 0인 아닌 요소는 추후 계산을 위해 배열에 해당 값에 따른 카운트 값 저장
            C[remainder]++;
        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer += (C[i] * (C[i] - 1) / 2);
            }
        }

        System.out.println(answer);
    }
}

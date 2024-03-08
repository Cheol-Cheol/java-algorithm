package doit.자료구조.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 투포인터 알고리즘 + 슬라이드 윈도우?
 */
public class b2435 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 입력 초기화
        int[] tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        // 0 ~ K-1번째 요소 합 미리 세팅
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += tmp[i];
        }

        // K번째 요소부터 끝 요소까지 슬라이딩 윈도우
        int max = sum;
        int lt = 0;
        for (int rt = K; rt < N; rt++) {
            sum = sum - tmp[lt++] + tmp[rt];

            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}

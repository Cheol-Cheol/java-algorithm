package doit.자료구조.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // +1 크기의 배열 선언 0으로 초기화 됨 [0, 0, 0, 0, 0 ,0]
        int[] sArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        // 합 배열 초기화
        for (int i = 1; i <= N; i++) {
            sArr[i] = sArr[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 테스트 케이스
        for (int t = 0; t < M; t++) {
            // i, j 값 입력
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 구간 합 구하기
            System.out.println(sArr[j] - sArr[i - 1]);
        }
    }
}

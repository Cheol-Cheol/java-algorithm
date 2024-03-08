package doit.자료구조.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 구간 합 알고리즘 사용하기
 * 합 배열을 만든다.
 * 합 배열을 순회하면서
 * - if(el > 100) answer = el, break
 */
public class b2851 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 합 배열 초기화
        int[] Asum = new int[11];
        int answer = 0;
        int CRITERIA = 100;
        for (int i = 1; i <= 10; i++) {
            Asum[i] = Asum[i - 1] + Integer.parseInt(br.readLine());
            // 구간 합 순회
            if (Asum[i] > CRITERIA) {
                int beforeEl = Asum[i - 1];
                int presentEl = Asum[i];
                int beforeDiff = Math.abs(CRITERIA - beforeEl);
                int presentDiff = Math.abs(CRITERIA - presentEl);

                if (beforeDiff < presentDiff) {
                    answer = beforeEl;
                } else if (beforeDiff == presentDiff) {
                    answer = presentEl;
                } else {
                    answer = presentEl;
                }

                break;
            } else {
                // 합이 100이 안될 경우
                answer = Asum[Asum.length - 1];
            }
        }
        System.out.println(answer);
    }
}

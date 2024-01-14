package doit.자료구조.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 1, cnt = 1, start_idx = 1, end_idx = 1;

        // O(n) 단일 반복문, 값 1은 미리 더한 상태로 시작
        while (end_idx != N) {
            if (sum > N) {
                sum -= start_idx;
                start_idx++;
            } else if (sum == N) {
                cnt++;
                end_idx++;
                sum += end_idx;
            } else {
                end_idx++;
                sum += end_idx;
            }
        }

        System.out.println(cnt);
    }
}

package doit.자료구조.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];

        // 입력값 초기화
        for (int i = 0; i < N; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        // 버블 정렬 구현
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    int tmp = answer[j + 1];
                    answer[j + 1] = answer[j];
                    answer[j] = tmp;
                }
            }
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}

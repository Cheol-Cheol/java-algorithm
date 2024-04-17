package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b2503 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] hint = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                hint[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 완전 탐색
        int answer = 0;
        for (int A = 1; A <= 9; A++) {
            for (int B = 1; B <= 9; B++) {
                for (int C = 1; C <= 9; C++) {
                    if (A == B || B == C || A == C) {
                        continue;
                    }

                    int count = 0;
                    for (int[] num : hint) {
                        // 입력값 세팅
                        int[] intArr = Arrays.stream(String.valueOf(num[0])
                                        .split(""))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        int strike = num[1];
                        int ball = num[2];

                        int strike_count = 0;
                        int ball_count = 0;

                        // 스트라이크 계산
                        if (A == intArr[0]) {
                            strike_count++;
                        }
                        if (B == intArr[1]) {
                            strike_count++;
                        }
                        if (C == intArr[2]) {
                            strike_count++;
                        }

                        // 볼 계산
                        if (A == intArr[1] || A == intArr[2]) {
                            ball_count++;
                        }
                        if (B == intArr[0] || B == intArr[2]) {
                            ball_count++;
                        }
                        if (C == intArr[0] || C == intArr[1]) {
                            ball_count++;
                        }

                        // 입력값 비교
                        if (strike == strike_count && ball == ball_count) {
                            count++;
                        }
                    }

                    if (count == N) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}

package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 임시반장정하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int map[][] = new int[5][T];
		int count[][] = new int[5][T];
		int max = Integer.MIN_VALUE;
		int answer = 0;

		// 입력값 초기화
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < T; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 열을 기준으로 비교
		for (int i = 0; i < 5; i++) {
			int cnt = 0;

			for (int j = 0; j < T; j++) {

				for (int k = 0; k < T; k++) {
					if (map[j][i] == map[k][i] ) {
						cnt++;
					}
				}
			}
		}

		// 행을 기준으로 합산 i+1가 정답
		for (int i = 0; i < 5; i++) {
			int sum = 0;

			for (int j = 0; j < T; j++) {
				sum += count[i][j];
			}

			if (sum > max) {
				max = sum;
				answer = i + 1;
			}
		}

		System.out.println(answer);

	}
}

package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 격자판최대합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int map[][] = new int[T][T];
		int sumX = 0;
		int sumY = 0;
		int answer = Integer.MIN_VALUE;

		// 입력값 초기화
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < T; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 행과 열의 합
		for (int i = 0; i < T; i++) {
			sumX = 0;
			sumY = 0;

			for (int j = 0; j < T; j++) {
				sumX += map[i][j];
				sumY += map[j][i];
			}

			int val = Math.max(sumX, sumY);

			if (answer < val) {
				answer = val;
			}
		}

		// 대각선의 합
		sumX = 0;
		sumY = 0;
		for (int i = 0; i < T; i++) {
			sumX += map[i][i];
			sumY += map[i][T - i - 1];
		}

		int tmp = Math.max(sumX, sumY);

		if(answer < tmp) {
			answer = tmp;
		}

		System.out.println(answer);
	}
}

package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 멘토링 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int map[][] = new int[M][N];
		int answer = 0;

		// 입력값 초기화
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 모든 경우의 수 순회
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				// (3, 1)
				int cnt = 0;

				for (int k = 0; k < M; k++) {
					int pi = 0, pj = 0;

					for (int l = 0; l < N; l++) {
						if (map[k][l] == i) {
							pi = l;
						}
						if (map[k][l] == j) {
							pj = l;
						}
					}

					if (pi < pj)
						cnt++;
				}
				if(cnt == M){
					answer++;
				}
			}
		}

		System.out.println(answer);
	}

}

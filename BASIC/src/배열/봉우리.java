package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 봉우리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int map[][] = new int[T + 2][T + 2];
		int cnt = 0;

		// 입력값 초기화
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 1; j <= T; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 위 오 아 왼
		int[] dirX = {-1, 0, 1, 0};
		int[] dirY = {0, 1, 0, -1};

		for (int i = 1; i <= T; i++) {
			for (int j = 1; j <= T; j++) {
				boolean flag = true;

				for (int k = 0; k < 4; k++) {
					int newX = i + dirX[k];
					int newY = j + dirY[k];

					if (map[i][j] <= map[newX][newY]) {
						flag = false;
						break;
					}
				}

				if (flag)
					cnt += 1;
			}
		}

		System.out.println(cnt);

	}
}

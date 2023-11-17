package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 등수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] score = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < T; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < T; i++) {
			int cnt = 1;

			for (int j = 0; j < T; j++) {
				if (score[i] < score[j]) {
					cnt += 1;
				}
			}

			System.out.print(cnt + " ");
		}
	}
}

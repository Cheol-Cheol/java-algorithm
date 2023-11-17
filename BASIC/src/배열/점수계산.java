package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점수계산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] score = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < T; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		int answer = 0;

		for (int s : score) {
			if (s == 0) {
				cnt = 0;
			} else {
				cnt += 1;
				answer += cnt;
			}
		}

		System.out.println(answer);
	}
}

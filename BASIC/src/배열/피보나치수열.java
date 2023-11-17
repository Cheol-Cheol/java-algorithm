package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] answer = new int[T];
		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < T; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}

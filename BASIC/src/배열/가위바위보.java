package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위바위보 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] A = new int[T];
		int[] B = new int[T];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < T; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < T; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < T; i++) {
			String winner;

			if (A[i] == B[i]) {
				winner = "D";
			} else if ((A[i] == 2 && B[i] == 1)
				|| (A[i] == 3 && B[i] == 2)
				|| (A[i] == 1 && B[i] == 3)
			) {
				winner = "A";
			} else {
				winner = "B";
			}

			System.out.println(winner);
		}
	}
}
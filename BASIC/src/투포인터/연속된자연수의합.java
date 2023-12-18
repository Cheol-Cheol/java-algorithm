package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연속된자연수의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = N / 2 + 1;
		int[] arr = new int[M];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// 투 포인터 적용
		int lt = 0, sum = 0, answer = 0;
		for (int rt = 0; rt < arr.length; rt++) {
			sum += arr[rt];

			if (sum == N)
				answer++;

			while (sum >= N) {
				sum -= arr[lt++];

				if (sum == N)
					answer++;
			}
		}

		System.out.println(answer);
	}
}

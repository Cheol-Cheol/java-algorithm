package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속부분수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int nums[] = new int[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int lt = 0, rt = 0, answer = 0, sum = 0;
		// 8 6
		while (rt < N) {
			if (rt == 0) {
				sum += nums[0];
				rt++;
			}

			if (sum == M) {
				answer++;
				sum -= nums[lt];
				lt++;
			} else if (sum < M) {
				rt++;
				sum += nums[lt];
			} else if (sum > M) {
				sum -= nums[lt];
				lt++;
			}
		}

		System.out.println(answer);
	}
}

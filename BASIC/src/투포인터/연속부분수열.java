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
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 투 포인터 + 슬라이딩 윈도우
		int lt = 0, sum = 0, answer = 0;
		for (int rt = 0; rt < N; rt++) {
			sum += arr[rt];

			if (sum == M)
				answer++;

			while (sum >= M) {
				sum -= arr[lt++];
				if(sum == M)
					answer++;
			}
		}

		System.out.println(answer);
	}
}

package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대매출 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int answer, sum = 0;
		// K 이전까지의 합
		for (int i = 0; i < K; i++) {
			sum += arr[i];
		}
		answer = sum;

		// 슬라이딩 윈도우
		for (int i = K; i < N; i++) {
			sum += (arr[i] - arr[i - K]);
			answer = Math.max(answer, sum);
		}

		System.out.println(answer);
	}
}

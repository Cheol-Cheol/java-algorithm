package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대길이연속부분수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 투포인터 적용
		int lt = 0, answer = 0, cnt = 0;
		for (int rt = 0; rt < arr.length; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}

			// K를 다 사용했을 경우
			while (cnt > K) {
				if (arr[lt++] == 0) {
					cnt--;
				}
			}

			answer = Math.max(answer, rt - lt + 1);
		}

		System.out.println(answer);
	}
}

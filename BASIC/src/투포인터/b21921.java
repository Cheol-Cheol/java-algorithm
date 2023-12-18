package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b21921 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 슬라인딩 윈도우 적용
		int sum = 0, answer = 0, cnt = 1;

		// X까지의 합을 미리 구하기
		for (int i = 0; i < X; i++) {
			sum += arr[i];
		}
		answer = sum;

		for (int i = X; i < arr.length; i++) {
			sum += (arr[i] - arr[i - X]);

			if (answer < sum) {
				answer = sum;
				cnt = 1;
			} else if (answer == sum) {
				cnt++;
			}

		}

		// 출력
		if (answer == 0) {
			System.out.println("SAD");
		} else {
			System.out.println(answer);
			System.out.println(cnt);
		}
	}
}

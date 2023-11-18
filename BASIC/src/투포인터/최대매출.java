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
		int money[] = new int[N];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			money[i] = Integer.parseInt(st.nextToken());
		}

		int p1 = 0, p2 = K;
		int max = Integer.MIN_VALUE;

		while (p2 != N) {
			int sum = 0;

			for (int i = p1; i < p2; i++) {
				sum += money[i];
			}

			if (max < sum) {
				max = sum;
				p1++;
				p2++;
			} else {
				p1++;
				p2++;
			}
		}

		System.out.println(max);
	}
}

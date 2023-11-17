package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 보이는학생 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] students = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt = 1;

		for (int i = 0; i < T; i++) {
			students[i] = Integer.parseInt(st.nextToken());
		}

		int max = students[0];

		for (int i = 1; i < T; i++) {
			if (students[i] > max) {
				cnt += 1;
				max = students[i];
			}
		}

		System.out.println(cnt);
	}
}

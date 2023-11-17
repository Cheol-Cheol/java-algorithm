package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 큰수출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[T];
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < T; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		// 첫번째 값 추가
		answer.add(array[0]);

		for (int i = 1; i < array.length ; i++) {
			if (array[i] > array[i - 1]) {
				answer.add(array[i]);
			}
		}

		for (int n : answer) {
			System.out.print(n + " ");
		}
	}
}

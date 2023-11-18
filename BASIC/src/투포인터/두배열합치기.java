package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 두배열합치기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫번째 배열 초기화
		int N = Integer.parseInt(br.readLine());
		int arr1[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		// 두번째 배열 초기화
		int M = Integer.parseInt(br.readLine());
		int arr2[] = new int[M];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}

		int p1 = 0, p2 = 0;
		ArrayList<Integer> answer = new ArrayList<>();

		// 둘 다 범위가 유효할 때
		while (p1 < N && p2 < M) {
			if (arr1[p1] < arr2[p2])
				answer.add(arr1[p1++]);
			else
				answer.add(arr2[p2++]);
		}

		// 남은 범위의 배열 나머지 추가
		while (p1 < N)
			answer.add(arr1[p1++]);
		while (p2 < M)
			answer.add(arr2[p2++]);

		for (Integer i : answer) {
			System.out.print(i + " ");
		}
	}
}

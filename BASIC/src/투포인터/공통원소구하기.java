package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 공통원소구하기 {

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
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// 작은 값의 포인터 증가
		while (p1 < N && p2 < M) {
			if (arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1++]);
				p2++;
			} else if (arr1[p1] < arr2[p2]) {
				p1++;
			} else {
				p2++;
			}
		}

		for (Integer i : answer) {
			System.out.print(i + " ");
		}
	}
}

package 해시_정렬지원Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 매출액의종류 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 투 포인터 + 슬라이딩 윈도우 + 해시 맵
		HashMap<Integer, Integer> map = new HashMap<>(N);
		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < K - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int lt = 0;
		for (int rt = K - 1; rt < N; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

			answer.add(map.size());

			map.put(arr[lt], map.get(arr[lt]) - 1);

			if (map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}

			lt++;
		}

		for (Integer i : answer) {
			System.out.print(i + " ");
		}
	}
}

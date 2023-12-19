package 해시_정렬지원Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 모든아나그램찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		String[] target = br.readLine().split("");

		HashMap<String, Integer> HM = new HashMap<>();
		HashMap<String, Integer> THM = new HashMap<>();

		// Target에 대한 HashMap 초기화
		for (int i = 0; i < target.length; i++) {
			THM.put(target[i], THM.getOrDefault(target[i], 0) + 1);
		}

		// Target - 1 이전까지 HashMap 초기화
		for (int i = 0; i < target.length - 1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}

		// 투 포인터 + 슬라이딩 윈도우 + 해시 맵 적용
		int lt = 0, answer = 0;
		for (int rt = target.length - 1; rt < arr.length; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);

			if (HM.equals(THM)) {
				answer++;
			}

			HM.put(arr[lt], HM.get(arr[lt]) - 1);

			if (HM.get(arr[lt]) == 0) {
				HM.remove(arr[lt]);
			}

			lt++;
		}

		System.out.println(answer);
	}
}

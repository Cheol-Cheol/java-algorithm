package lv1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {

	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] {-1};
		}

		int [] answer = new int[arr.length - 1];
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			min = Math.min(min, num);
		}

		int cnt = -1;
		for (int num : arr) {
			if (num == min) {
				continue;
			}

			cnt++;
			if (cnt != answer.length) {
				answer[cnt] = num;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		제일_작은_수_제거하기 T = new 제일_작은_수_제거하기();
		System.out.println(Arrays.toString(T.solution(new int[] {4, 3, 2, -10, 100})));
	}
}


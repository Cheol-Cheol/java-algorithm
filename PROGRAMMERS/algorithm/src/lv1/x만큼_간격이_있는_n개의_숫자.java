package lv1;

import java.util.Arrays;

/**
 * 1~n 까지 순회하면서 배열의 이전 요소에 +x 하면서 배열에 요소 추가하기
 */
public class x만큼_간격이_있는_n개의_숫자 {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];

		answer[0] = x;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}

		return answer;
	}

	public static void main(String[] args) {
		x만큼_간격이_있는_n개의_숫자 T = new x만큼_간격이_있는_n개의_숫자();
		System.out.println(Arrays.toString(T.solution(-4, 2)));
	}
}

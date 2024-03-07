package lv1;

import java.util.Arrays;

public class 평균_구하기 {
	public double solution(int[] arr) {
		double answer = 0;

		for (int i : arr) {
			answer += i;
		}

		return answer / arr.length;
	}

	public static void main(String[] args) {
		평균_구하기 T = new 평균_구하기();
		System.out.println(T.solution(new int[] {1, 2, 3, 4}));
	}
}

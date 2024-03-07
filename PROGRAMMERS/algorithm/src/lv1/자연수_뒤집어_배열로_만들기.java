package lv1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
	public int[] solution(long n) {
		return new StringBuilder()
			.append(n)
			.reverse()
			.chars()
			.map(Character::getNumericValue)
			.toArray();
	}

	public static void main(String[] args) {
		자연수_뒤집어_배열로_만들기 T = new 자연수_뒤집어_배열로_만들기();
		System.out.println(Arrays.toString(T.solution(12345)));
	}
}

// public int[] solution(long n) {
// 	String[] nStrArr = String.valueOf(n).split("");
// 	int[] answer = new int[nStrArr.length];
//
// 	for (int i = 0; i < answer.length; i++) {
// 		answer[i] = Integer.parseInt(nStrArr[nStrArr.length - 1 - i]);
// 	}
//
// 	System.out.println(Character.getNumericValue('h'));
// 	return answer;
// }

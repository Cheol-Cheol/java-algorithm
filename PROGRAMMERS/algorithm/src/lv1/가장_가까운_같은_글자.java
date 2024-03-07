package lv1;

import java.util.Arrays;

public class 가장_가까운_같은_글자 {
	public int[] solution(String s) {
		String[] sArr = s.split("");
		int[] answer = new int[sArr.length];

		answer[0] = -1;
		for (int i = 1; i < sArr.length; i++) {
			answer[i] = -1;
			for (int j = i - 1; j >= 0; j--) {
				if (sArr[i].equals(sArr[j])) {
					answer[i] = i - j;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		가장_가까운_같은_글자 T = new 가장_가까운_같은_글자();
		System.out.println(Arrays.toString(T.solution("banana")));
	}
}

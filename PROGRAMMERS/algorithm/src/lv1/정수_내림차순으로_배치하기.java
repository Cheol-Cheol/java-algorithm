package lv1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
	public long solution(long n) {
		String[] strArr = String.valueOf(n).split("");
		Arrays.sort(strArr, Collections.reverseOrder());

		String tmp = "";
		for (String s : strArr) {
			tmp += s;
		}

		return Long.parseLong(tmp);
	}

	public static void main(String[] args) {
		정수_내림차순으로_배치하기 T = new 정수_내림차순으로_배치하기();
		System.out.println(T.solution(118372));
	}
}

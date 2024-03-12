package lv1;

import java.util.Arrays;

/**
 * 정렬 기준이 되는 문자를 맨 앞으로 붙이기
 */
public class 문자열_내_마음대로_정렬하기 {

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].charAt(n) + strings[i];
		}

		Arrays.sort(answer);

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answer[i].substring(1);
		}

		return answer;
	}

	public static void main(String[] args) {
		문자열_내_마음대로_정렬하기 T = new 문자열_내_마음대로_정렬하기();
		System.out.println(Arrays.toString(T.solution(new String[] {"abce", "abcd", "cdx"}, 2)));
	}
}

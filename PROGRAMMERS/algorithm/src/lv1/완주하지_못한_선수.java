package lv1;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// 1. 완주하지 못한 선수 찾기
// 2. 두 개의 배열 정렬
// 3. 단일 반복문 순회하면서 일치하지 않는 요소 반환
//      1. 반복문의 크기는 크기가 더 작은 완주 배열로 설정(인덱스 범위 초과 방지)
//      2. 반복문을 다 돌고나서 요소를 찾지못하면 참가자 배열의 맨 마지막 요소 반환
public class 완주하지_못한_선수 {
	public String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!(participant[i].equals(completion[i]))) {
				return participant[i];
			}
		}

		return participant[i];
	}

	public static void main(String[] args) {
		완주하지_못한_선수 T = new 완주하지_못한_선수();
		System.out.println(T.solution(
			new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
			new String[] {"josipa", "filipa", "marina", "nikola"}));
	}
}

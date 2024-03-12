package lv1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * 중복 제거, 자동 정렬 TreeSet
 */
public class 두_개_뽑아서_더하기 {
	public int[] solution(int[] numbers) {
		Set<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				treeSet.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[treeSet.size()];
		int pos =0;
		for (int el : treeSet) {
			answer[pos++] = el;
		}

		return answer;
	}

	public static void main(String[] args) {
		두_개_뽑아서_더하기 T = new 두_개_뽑아서_더하기();
		System.out.println(Arrays.toString(T.solution(new int[] {2, 1, 3, 4, 1})));
	}
}

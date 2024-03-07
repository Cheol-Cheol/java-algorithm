package lv1;

import java.util.Arrays;
import java.util.Stack;

public class 같은_숫자는_싫어 {

	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();

		for (int i : arr) {
			if (stack.isEmpty() || stack.peek() != i) {
				stack.push(i);
			}
		}

		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		같은_숫자는_싫어 T = new 같은_숫자는_싫어();
		System.out.println(Arrays.toString(T.solution(new int[] {1, 1, 3, 3, 0, 1, 1})));
	}
}

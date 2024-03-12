package lv1;

/**
 * food[0]: 물의 양이고, 항상 1
 * food[i]: i번의 음식의 수
 * [1, 3, 4, 6]	-> "1223330333221"
 * 이중 for문
 * 방법1) Stack 사용하기 ❌
 * 방법2) StringBuilder로 뒤집고 합치기 -> 단일 반복문 가능 ✅
 */
public class 푸드_파이트_대회 {

	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			sb.append(String.valueOf(i).repeat(food[i] / 2));
		}

		String answer = sb + "0";
		return answer + sb.reverse();
	}

	public static void main(String[] args) {
		푸드_파이트_대회 T = new 푸드_파이트_대회();
		System.out.println(T.solution(new int[] {1, 3, 4, 6}));
	}
}

// public String solution(int[] food) {
// 	String answer = "";
// 	Stack<Integer> stack = new Stack<>();
//
// 	for (int i = 1; i < food.length; i++) {
// 		for (int j = 0; j < food[i] / 2; j++) {
// 			answer += i;
// 			stack.push(i);
// 		}
// 	}
//
// 	// 물 추가
// 	answer += 0;
//
// 	// 반대로 추가
// 	while (!stack.isEmpty()) {
// 		answer += stack.pop();
// 	}
//
// 	return answer;
// }

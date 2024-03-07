package lv1;

import java.util.Arrays;

/**
 * divisor로 나누어 떨어지는 값 배열 오름차순 반환
 * 나누어 떨어지는 값이 없다면 -1 배열 반환
 */
public class 나누어_떨어지는_숫자_배열 {
	public int[] solution(int[] arr, int divisor) {
		int[] intArr = Arrays.stream(arr)
			.filter(n -> n % divisor == 0)
			.toArray();

		if(intArr.length==0) {
			intArr = new int[] {-1};
		} else {
			Arrays.sort(intArr);
		}

		return intArr;
	}

	public static void main(String[] args) {
		나누어_떨어지는_숫자_배열 T = new 나누어_떨어지는_숫자_배열();
		System.out.println(Arrays.toString(T.solution(new int[] {5,9,7,10}, 5)));
	}
}

// public ArrayList<Integer> solution(int[] arr, int divisor) {
// 	ArrayList<Integer> answer = new ArrayList<>();
//
// 	for (int i = 0; i < arr.length; i++) {
// 		if (arr[i] % divisor == 0) {
// 			answer.add(arr[i]);
// 		}
// 	}
//
// 	if (answer.size() == 0) {
// 		answer.add(-1);
// 	} else {
// 		Collections.sort(answer);
// 	}
//
// 	return answer;
// }

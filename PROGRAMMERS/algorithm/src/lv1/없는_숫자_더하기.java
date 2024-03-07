package lv1;

public class 없는_숫자_더하기 {
	public int solution(int[] numbers) {
		int sum = 45;

		for (int number : numbers) {
			sum -= number;
		}

		return sum;
	}

	public static void main(String[] args) {
		없는_숫자_더하기 T = new 없는_숫자_더하기();
		System.out.println(T.solution(new int[] {5, 8, 4, 0, 6, 7, 9}));
	}
}

// public int solution(int[] numbers) {
// 	int answer = 0;
// 	int[] tmpArr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//
// 	for (int i = 0; i < numbers.length; i++) {
// 		tmpArr[numbers[i]] = 0;
// 	}
//
// 	for (int i = 0; i < tmpArr.length; i++) {
// 		if(tmpArr[i] == 1){
// 			answer += i;
// 		}
// 	}
//
// 	return answer;
// }
package lv1;

import java.util.Arrays;

/**
 * 유클리드 호제법
 * 1) 큰 수를 작은 수로 나눈 나머지
 * 2) 이전의 작은 수를 나머지로 나눈 나머지
 * 3) 나머지가 0이 됐을 때까지 1~2번을 반복 -> 마지막 나누는 수로 사용된 값이 최대공약수
 *
 * 두 수의 곱을 최대공약수로 나눈 몫 -> 최소공배수
 */
public class 최대공약수와_최소공배수 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		int max = Math.max(n, m);
		int min = Math.min(n, m);

		while(true){
			int 나머지 = max % min;

			if(나머지 == 0) {
				answer[0] = min;
				break;
			}

			max = min;
			min = 나머지;
		}

		answer[1] = n * m / answer[0];

		return answer;
	}
	public static void main(String[] args) {
		최대공약수와_최소공배수 T = new 최대공약수와_최소공배수();
		System.out.println(Arrays.toString(T.solution(2, 5)));
	}
}

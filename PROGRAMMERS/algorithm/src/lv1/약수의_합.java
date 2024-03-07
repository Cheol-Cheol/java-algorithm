package lv1;

/**
 * 약수를 구하고 총합을 구한다.
 * 1~n/2만큼 순회
 * - n으로 나눈 나머지가 0인 것들 찾아 더하기
 */
public class 약수의_합 {
	public int solution(int n) {
		int answer = n;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		약수의_합 T = new 약수의_합();
		System.out.println(T.solution(12));
	}
}


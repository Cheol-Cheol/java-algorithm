package lv1;

/**
 * 짝수 -> 2로 나누기
 * 홀수 -> 3을 곱하고 1을 더하기
 * 1이 될 때 까지 반복
 */
public class 콜라츠_추측 {
	public int solution(long num) {
		int answer = 0;

		while (num != 1) {
			if(answer == 500){
				answer = -1;
				break;
			}

			num = num % 2 == 0 ? num / 2 : num * 3 + 1;
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		콜라츠_추측 T = new 콜라츠_추측();
		System.out.println(T.solution(626331));
	}
}

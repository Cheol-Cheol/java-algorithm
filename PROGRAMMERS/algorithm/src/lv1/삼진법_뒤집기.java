package lv1;

public class 삼진법_뒤집기 {
	public int solution(int n) {
		String answer = "";

		// 10 -> 3
		while(n != 0){
			answer += n % 3;
			n /= 3;
		}

		return Integer.parseInt(answer, 3);
	}

	public static void main(String[] args) {
		삼진법_뒤집기 T = new 삼진법_뒤집기();
		System.out.println(T.solution(45));
	}
}

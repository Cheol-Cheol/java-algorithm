package lv1;

public class 정수_제곱근_판별 {
	public long solution(long n) {
		return Math.pow((int)Math.sqrt(n), 2) == n ? (long)Math.pow((int)Math.sqrt(n) + 1, 2) : -1L;
	}

	public static void main(String[] args) {
		정수_제곱근_판별 T = new 정수_제곱근_판별();
		System.out.println(T.solution(121));
	}
}

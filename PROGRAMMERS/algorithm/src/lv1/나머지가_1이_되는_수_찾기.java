package lv1;

/**
 * 나머지가 1이 되는 작은 자연수 구하기
 * 1~n까지 순회
 */
public class 나머지가_1이_되는_수_찾기 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 1) {
				answer = i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		나머지가_1이_되는_수_찾기 T = new 나머지가_1이_되는_수_찾기();
		System.out.println(T.solution(12));
	}
}

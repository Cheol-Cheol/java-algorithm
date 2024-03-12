package lv1;

public class 숫자_문자열과_영단어 {
	public int solution(String s) {
		String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < nums.length; i++) {
			s = s.replace(nums[i], String.valueOf(i));
		}

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		숫자_문자열과_영단어 T = new 숫자_문자열과_영단어();
		System.out.println(T.solution("one4seveneight"));
	}
}

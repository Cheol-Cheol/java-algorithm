package lv1;

public class 문자열_다루기_기본 {
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			for (char c : s.toCharArray()) {
				if (!Character.isDigit(c)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		문자열_다루기_기본 T = new 문자열_다루기_기본();
		System.out.println(T.solution("1234"));
	}
}

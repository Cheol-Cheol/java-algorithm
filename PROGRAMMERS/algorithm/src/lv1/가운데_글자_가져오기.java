package lv1;

public class 가운데_글자_가져오기 {
	public String solution(String s) {
		String answer = "";
		int len = s.length();

		if (s.length() % 2 == 0) {
			answer = s.substring((len / 2) - 1, (len / 2) + 1);
		} else {
			answer = s.substring((len / 2), (len / 2) + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		가운데_글자_가져오기 T = new 가운데_글자_가져오기();
		System.out.println(T.solution("qwer"));
	}
}

// public String solution(String s) {
// 	String answer = "";
//
// 	if (s.length() % 2 == 0) {
// 		answer += s.charAt(s.length() / 2 - 1);
// 		answer += s.charAt(s.length() / 2);
// 	} else {
// 		answer += s.charAt(s.length() / 2);
// 	}
//
// 	return answer;
// }
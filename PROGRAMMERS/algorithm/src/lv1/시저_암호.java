package lv1;

public class 시저_암호 {

	public String solution(String s, int n) {
		String answer = "";

		char[] charArr = s.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			char ch = charArr[i];
			// 공백
			if (ch == ' ') {
				answer += ch;
				continue;
			}

			if ('a' <= ch && ch <= 'z') { //소문자
				if (ch + n > 'z') {
					answer += (char)(ch - 26 + n);
				} else {
					answer += (char)(ch + n);
				}
			} else if ('A' <= ch && ch <= 'Z') { //대문자
				if (ch + n > 'Z') {
					answer += (char)(ch - 26 + n);
				} else {
					answer += (char)(ch + n);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		시저_암호 T = new 시저_암호();
		System.out.println(T.solution("a B z", 4));
	}
}


// public String solution(String s, int n) {
// 	String answer = "";
//
//
// 	for(int i=0; i<s.length(); i++) {
// 		char ch = s.charAt(i);
//
// 		if(Character.isLowerCase(ch)) { //소문자
// 			ch = (char) ((ch - 'a' + n) % 26 + 'a');
// 		} else if(Character.isUpperCase(ch)) { //대문자
// 			ch = (char) ((ch - 'A' + n) % 26 + 'A');
// 		}
//
// 		answer += ch;
// 	}
//
//
// 	return answer;
// }

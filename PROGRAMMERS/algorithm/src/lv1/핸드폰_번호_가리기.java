package lv1;

public class 핸드폰_번호_가리기 {
	public String solution(String phone_number) {
		String[] strArr = phone_number.split("");

		for (int i = 0; i < strArr.length - 4; i++) {
			strArr[i] = "*";
		}

		return String.join("", strArr);
	}

	public static void main(String[] args) {
		핸드폰_번호_가리기 T = new 핸드폰_번호_가리기();
		System.out.println(T.solution("027778888"));
	}
}

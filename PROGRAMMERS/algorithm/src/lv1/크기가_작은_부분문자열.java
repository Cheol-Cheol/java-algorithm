package lv1;

/**
 * 슬라이딩 윈도우
 */
public class 크기가_작은_부분문자열 {

	public int solution(String t, String p) {
		int answer = 0;

		int end_index = t.length() - p.length();
		for (int start_index = 0; start_index <= end_index; start_index++) {
			String tmp = "";

			for (int i = start_index; i < p.length() + start_index; i++) {
				tmp += (t.charAt(i) - '0');
			}

			if (Long.parseLong(tmp) <= Long.parseLong(p)) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		크기가_작은_부분문자열 T = new 크기가_작은_부분문자열();
		System.out.println(T.solution("3141592", "271"));
	}
}

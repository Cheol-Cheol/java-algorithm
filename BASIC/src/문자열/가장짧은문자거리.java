package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장짧은문자거리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		char[] strToChar = s.toCharArray();
		char t = st.nextToken().charAt(0);

		int[] answer = new int[s.length()];
		int p = 1000; // 거리를 뜻함, 문자열의 길이는 100을 넘지 않으므로 1,000으로 초기화한다.

		// ->
		for (int i = 0; i < strToChar.length; i++) {
			if (strToChar[i] != t) {
				p++;
				answer[i] = p;
			} else {
				p = 0;
				answer[i] = p;
			}
		}

		// <-
		p = 1000;
		for (int i = strToChar.length - 1; i >= 0; i--) {
			if (strToChar[i] != t) {
				p++;
				answer[i] = Math.min(answer[i], p);
			} else {
				p = 0;
			}
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}

package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열압축 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine() + " ";
		String answer = "";
		int cnt = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				cnt++;
			} else {
				answer += str.charAt(i);

				if (cnt > 1) {
					answer += cnt;
					cnt = 1;
				}
			}
		}

		System.out.println(answer);
	}
}

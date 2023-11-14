package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine().toLowerCase();
		char ch = br.readLine().charAt(0);
		ch = Character.toLowerCase(ch);

		int answer = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				answer++;
		}

		sb.append(answer);
		System.out.println(sb);
	}
}

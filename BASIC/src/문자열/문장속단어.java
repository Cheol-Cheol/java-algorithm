package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문장속단어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int MAX = Integer.MIN_VALUE;
		String answer = "";

		String str = br.readLine();

		for (String s : str.split(" ")) {
			if (s.length() > MAX) {
				MAX = s.length();
				answer = s;
			}
		}

		sb.append(answer);
		System.out.println(sb);
	}
}

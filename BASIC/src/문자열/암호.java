package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 암호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String answer = "";

		for (int i = 0; i < T; i++) {
			String str = input
				.substring(0, 7)
				.replace('#', '1')
				.replace('*', '0');

			int num10 = Integer.parseInt(str, 2);
			answer += (char)num10;

			input = input.substring(7);
		}

		System.out.println(answer);
	}
}

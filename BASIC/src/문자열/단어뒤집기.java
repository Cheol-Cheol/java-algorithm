package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			System.out.println(sb);
		}
	}
}

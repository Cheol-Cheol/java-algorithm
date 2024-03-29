package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 회문문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toLowerCase();
		String answer = "NO";

		StringBuilder sb = new StringBuilder(str).reverse();

		if (str.equals(sb.toString())) {
			answer = "YES";
		}

		System.out.println(answer);
	}
}

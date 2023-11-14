package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String result = "";

		for (char c : str.toCharArray()) {
			if (Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			} else {
				result += Character.toLowerCase(c);
			}
		}

		System.out.println(result);
	}
}

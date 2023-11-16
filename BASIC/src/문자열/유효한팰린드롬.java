package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 유효한팰린드롬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
		String reversedStr = new StringBuilder(str).reverse().toString();

		String answer = "NO";

		if(str.equals(reversedStr)){
			answer = "YES";
		}

		System.out.println(answer);
	}
}

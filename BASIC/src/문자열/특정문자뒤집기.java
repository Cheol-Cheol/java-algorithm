package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 특정문자뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] strToChar = str.toCharArray();
		int lt = 0;
		int rt = strToChar.length - 1;

		while (lt < rt) {
			if (!Character.isAlphabetic(strToChar[lt]))
				lt++;
			else if (!Character.isAlphabetic(strToChar[rt]))
				rt--;
			else {
				char tmp = strToChar[rt];
				strToChar[rt] = strToChar[lt];
				strToChar[lt] = tmp;
				lt++;
				rt--;
			}
		}

		System.out.println(String.valueOf(strToChar));
	}
}

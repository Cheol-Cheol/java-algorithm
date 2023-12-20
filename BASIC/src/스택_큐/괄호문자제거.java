package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char c : arr) {
			if (c == ')') {
				while (stack.pop() != '(');
			} else {
				stack.push(c);
			}
		}

		for (Character character : stack) {
			System.out.print(character);
		}
	}
}

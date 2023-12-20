package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		String answer = "YES";

		for (char c : arr) {
			if (c == '(') {
				stack.push(c);
			} else {
				// 예외 - stack이 비어있는 상태에서 ')'가 들어오면 잘못된 괄호이다.
				if (stack.isEmpty()) {
					answer = "NO";
					break;
				}
				stack.pop();
			}
		}

		if(!stack.isEmpty()){
			answer = "NO";
		}
		System.out.println(answer);
	}
}

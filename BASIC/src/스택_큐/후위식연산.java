package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식연산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (char c : arr) {
			if (Character.isDigit(c)) {
				stack.push(c - 48);
			} else {
				int rt = stack.pop();
				int lt = stack.pop();

				if (c == '+')
					stack.push(lt + rt);
				else if (c == '-')
					stack.push(lt - rt);
				else if (c == '*')
					stack.push(lt * rt);
				else if (c == '/')
					stack.push(lt / rt);
			}
		}

		// 출력
		answer = stack.get(0);
		System.out.println(answer);
	}
}

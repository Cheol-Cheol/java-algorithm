package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 쇠막대기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		Stack<String> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")){
				stack.push(arr[i]);
			}
			else {
				if (!stack.isEmpty() && (arr[i - 1].equals("("))) {
					stack.pop();
					// 레이저
					answer += stack.size();
				} else if (!stack.isEmpty() && (arr[i - 1].equals(")"))) {
					// 막대기의 끝
					stack.pop();
					answer += 1;
				}
			}
		}

		// 출력
		System.out.println(answer);
	}
}

package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String cmd = br.readLine();
            if (cmd.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < cmd.length(); i++) {
                char c = cmd.charAt(i);

                switch (c) {
                    case '(':
                    case '[':
                        stack.push(c);
                        break;
                    case ')':
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.push(')');
                        }
                        break;
                    case ']':
                        if (!stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(']');
                        }
                        break;
                }
            }
            System.out.println(stack.isEmpty() ? "yes" : "no");
        }
        br.close();
    }
}

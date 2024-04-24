package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Stack<Character> stack = new Stack<>();
            String cmd = br.readLine();

            for (int i = 0; i < cmd.length(); i++) {
                if (cmd.charAt(i) == '(') {
                    stack.push(cmd.charAt(i));
                } else if (stack.isEmpty()) {
                    stack.push(cmd.charAt(i));
                    break;
                } else {
                    stack.pop();
                }
            }

            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
        br.close();
    }
}

package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < K; i++) {
            int cmd = Integer.parseInt(br.readLine());
            if (cmd != 0) {
                stack.push(cmd);
                result += cmd;
            } else {
                int number = stack.pop();
                result -= number;
            }
        }
        System.out.println(result);
    }
}

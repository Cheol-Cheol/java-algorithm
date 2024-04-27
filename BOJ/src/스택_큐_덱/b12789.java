package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
// 다시
public class b12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> waiting = new Stack<>();
        for (int i = 0; i < N; i++) {
            waiting.push(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(waiting, Collections.reverseOrder());

        String result = "Nice";
        for (int i = 1; i <= N; i++) {
            if (waiting.pop() != i) {
                result = "Sad";
                break;
            }
        }

        System.out.println(result);
    }
}

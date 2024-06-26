package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        sb.append("<");
        while (queue.size() != 1) {
            int el = queue.poll();
            cnt++;

            if (cnt == K) {
                sb.append(el).append(", ");
                cnt = 0;
            } else {
                queue.offer(el);
            }
        }
        sb.append(queue.poll() + ">");
        System.out.println(sb);
        br.close();
    }
}

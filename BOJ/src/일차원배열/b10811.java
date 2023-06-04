package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class b10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] basket = IntStream.range(1, Integer.parseInt(st.nextToken()) + 1).toArray();
        int M = Integer.parseInt(st.nextToken());

        for (int T = 0; T < M; T++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // 범위 내 배열 뒤집기
            for (int i = start; i <= (end - start) / 2 + start; i++) {
                int temp = basket[i - 1];
                basket[i - 1] = basket[end - i + start - 1];
                basket[end - i + start - 1] = temp;
            }
        }

        for (int i : basket) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}



package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < chess.length; i++) {
            int item = Integer.parseInt(st.nextToken());

            sb.append(chess[i] - item).append(" ");
        }

        System.out.println(sb);
    }
}

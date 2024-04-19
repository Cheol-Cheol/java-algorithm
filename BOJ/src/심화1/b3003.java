package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pieces = new int[6];
        int[] targets = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            pieces[i] = Integer.parseInt(st.nextToken());
            System.out.print(targets[i] - pieces[i] + " ");
        }
    }
}

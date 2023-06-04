package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            String first = String.valueOf(str.charAt(0));
            String end = String.valueOf(str.charAt(str.length() - 1));
            sb.append(first + end + "\n");
        }

        System.out.println(sb);
    }
}

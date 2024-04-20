package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (isGroupString(br.readLine())) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }

    public static boolean isGroupString(String str) {
        boolean[] alpha = new boolean[26];
        for (int j = 0; j < str.length(); j++) {
            int now = str.charAt(j);
            int prev = j > 0 ? str.charAt(j - 1) : 0;
            if (alpha[now - 'a'] == false) {
                alpha[now - 'a'] = true;
            } else if (now != prev) {
                return false;
            }
        }
        return true;
    }
}

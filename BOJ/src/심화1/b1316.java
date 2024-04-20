package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = N;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean[] arr = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                if (arr[str.charAt(j) - 'a'] == false) {
                    arr[str.charAt(j) - 'a'] = true;
                } else if (j > 0 && str.charAt(j) != str.charAt(j - 1)) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}

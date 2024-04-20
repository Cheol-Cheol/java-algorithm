package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String upperStr = br.readLine().toUpperCase(); // ZZA
        int[] alpha = new int[26];
        for (int i = 0; i < upperStr.length(); i++) {
            alpha[upperStr.charAt(i) - 65]++;
        }

        int max = Integer.MIN_VALUE;
        char ch = '?';
        for (int i = 0; i < alpha.length; i++) {
            if (max == alpha[i]) {
                ch = '?';
            } else if (max < alpha[i]) {
                max = alpha[i];
                ch = (char) (i + 65);
            }
        }

        System.out.println(ch);
    }
}

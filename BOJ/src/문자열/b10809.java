package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            if (alphabet[idx] == -1) alphabet[idx] = i;
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}

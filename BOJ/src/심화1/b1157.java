package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class b1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[26];
        String word = br.readLine().toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            int charNum = (int) word.charAt(i);
            int idx = charNum - 65;
            list[idx] = list[idx] + 1;
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                ch = (char) (i + 65);
            } else if (list[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}

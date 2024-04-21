package 이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] board = new String[5][15];
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String[] words = br.readLine().split("");
            if(maxLength <= words.length) {
                maxLength = words.length;
            }
            for (int j = 0; j < words.length; j++) {
                board[i][j] = words[j];
            }
        }

        String result = "";
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == null) {
                    continue;
                }
                result += board[j][i];
            }
        }
        System.out.println(result);
        br.close();
    }
}

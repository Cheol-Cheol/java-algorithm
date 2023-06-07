package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originalWord = br.readLine();
        int result = 1;

        for (int i = 0; i < originalWord.length() / 2; i++) {
            if (originalWord.charAt(i) != originalWord.charAt(originalWord.length() - 1 - i)) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}


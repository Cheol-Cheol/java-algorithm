package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        if (str.equals(reversedStr)) {
            result = 1;
        }
        System.out.println(result);
    }
}


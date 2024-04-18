package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;
        while (N != cnt) {
            num++;
            // 666이 포함되었으면 cnt+1
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}

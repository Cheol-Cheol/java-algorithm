package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
        StringBuilder sb = new StringBuilder(); // 출력
        StringTokenizer st; // 문자열 분리
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
        // 입력을 마치고 싶다면, cmd + d 입력
    }
}

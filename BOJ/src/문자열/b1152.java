package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1152 {
    public static void main(String[] args) throws IOException {
        // 입력값 자체가 공백으로 존재할 경우 0이 출력되어야 하지만, 해당 방식은 1을 출력한다. (오답)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().trim().split(" ");
        System.out.println(arr.length);
        //

        // 해당 방식은 0을 출력하게 됨
        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S, " ");
        System.out.println(st.countTokens()); // 토큰의 개수를 출력
    }
}

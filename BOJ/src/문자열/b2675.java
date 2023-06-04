package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    result += str.charAt(j);
                }
            }

            sb.append(result + "\n");
        }

        System.out.println(sb);
    }
}

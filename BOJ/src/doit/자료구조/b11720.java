package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        char[] cNum = br.readLine().toCharArray();
        int answer = 0;

        // 메인
        for (char c : cNum) {
            answer += (c - 48);
        }

        // 결과
        System.out.println(answer);
    }
}

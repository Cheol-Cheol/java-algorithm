package doit.자료구조.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * subString()
 */
public class b11059 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int maxLength = 0;
        for (int i = 0; i < S.length(); i++) {
            // 맨 앞에서 한 단어씩
            for (int j = i + 2; j <= S.length(); j += 2) {
                // i번째 다음 단어 짝수 단위로 2씩 증가하면서 탐색할 단어
                String subStr = S.substring(i, j);
                int sumFirstHalf = 0;
                int sumSecondHalf = 0;

                // 6789
                for (int k = 0; k < subStr.length() / 2; k++) {
                    // 탐색할 단어의 절반인 애들 합계를 위한 순회
                    sumFirstHalf += subStr.charAt(k) - '0';
                    sumSecondHalf += subStr.charAt(k + subStr.length() / 2) - '0';
                }

                // 쪼개진 애들의 합이 서로 같은지, maxLength 넘는지
                if (sumFirstHalf == sumSecondHalf && subStr.length() > maxLength) {
                    maxLength = subStr.length();
                }
            }
        }
        System.out.println(maxLength);
    }
}

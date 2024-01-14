package doit.자료구조.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] sNum = br.readLine().split(" ");
        int[] iNum = new int[T];

        // 배열 초기화
        for (int i = 0; i < T; i++) {
            iNum[i] = Integer.parseInt(sNum[i]);
        }

        // 최대값 구하는 동시, 총합 구하기
        long sum = 0;
        long max = 0;
        for (int i = 0; i < T; i++) {
            if(iNum[i] > max) {
                max = iNum[i];
            }

            sum += iNum[i];
        }

        // 마무리 연산 후 출력
        System.out.println(sum * 100.0 / T / max);
    }
}

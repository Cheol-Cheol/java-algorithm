package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];

        // 아홉 난쟁이 입력값 초기화 및 합계
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        // 오름차순 정렬
        Arrays.sort(heights);

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    for (int k = 0; k < heights.length; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(heights[k]);
                    }
                return;
                }
            }
        }
    }
}

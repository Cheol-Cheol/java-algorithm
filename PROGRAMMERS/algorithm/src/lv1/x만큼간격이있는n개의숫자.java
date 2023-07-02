package lv1;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        x만큼간격이있는n개의숫자 T = new x만큼간격이있는n개의숫자();
        System.out.println(Arrays.toString(T.solution(-4, 2)));
    }
}

package lv1;

import java.util.Arrays;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }

    public static void main(String[] args) {
        없는숫자더하기 T = new 없는숫자더하기();
        System.out.println(T.solution(new int[]{5,8,4,0,6,7,9}));
    }
}

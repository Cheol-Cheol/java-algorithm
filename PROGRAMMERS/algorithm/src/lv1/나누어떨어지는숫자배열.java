package lv1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(el -> el % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 T = new 나누어떨어지는숫자배열();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}

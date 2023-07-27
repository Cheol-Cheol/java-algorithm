package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {

    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();

        for (int a : arr) {
            answerList.add(a);
        }



        return answer;
    }

    public static void main(String[] args) {
        제일작은수제거하기 T = new 제일작은수제거하기();
        System.out.println(T.solution(new int[]{4, 3, 2, 1}));
    }
}

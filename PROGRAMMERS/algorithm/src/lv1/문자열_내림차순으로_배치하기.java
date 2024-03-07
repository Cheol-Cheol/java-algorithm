package lv1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        String answer = "";

        String[] strArr = s.split("");
        Arrays.sort(strArr, Collections.reverseOrder());

        return String.join("", strArr);
    }

    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 T = new 문자열_내림차순으로_배치하기();
        System.out.println(T.solution("Zbcdefg"));
    }
}

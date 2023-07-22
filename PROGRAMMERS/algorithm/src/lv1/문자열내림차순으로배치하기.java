package lv1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        StringBuilder sb = new StringBuilder(String.valueOf(ch));
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        문자열내림차순으로배치하기 T = new 문자열내림차순으로배치하기();
        System.out.println(T.solution("Zbcdefg"));
    }
}

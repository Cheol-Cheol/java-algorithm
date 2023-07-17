package lv1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        Arrays.sort(strArr);

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 T = new 정수내림차순으로배치하기();
        System.out.println(T.solution(118372));
    }
}

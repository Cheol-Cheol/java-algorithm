package 일차원배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열특정값찾기 {
    public static void main(String[] args) {
        // 1. 반복문
        String[] strArray = {"AB", "BC", "BCD", "CD", "CDEF"};

        for (String str : strArray) {
            if (str.equals("BCD")) {
                System.out.println("BCD는 1.strArray에 존재한다.");
            }
        }

        // 2. List 변환 후 contains()
        List<String> strList = new ArrayList<>(Arrays.asList(strArray));

        if (strList.contains("BCD")) {
            System.out.println("BCD는 2.strList에 존재한다.");
        }

        // 3. Stream API - anyMatch() (java 1.8+)
        boolean isExist = Arrays.stream(strArray).anyMatch("CD"::equals);
        if (isExist) System.out.println("CD는 3.strArray에 존재한다.");
    }
}

// https://developer-talk.tistory.com/666
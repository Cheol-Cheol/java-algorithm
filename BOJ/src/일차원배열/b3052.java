package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class b3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // HashSet 방법 - 1. 중복 허용x 2. 순서 보장x (만약 정렬하고싶다? 리스트 변환 후 정렬하기)
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());

        // 배열 방법
        boolean[] arr = new boolean[42]; // false 로 초기화

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        int count = 0;
        for (boolean b : arr) {
            if (b) count++;
        }

        System.out.println(count);
    }
}


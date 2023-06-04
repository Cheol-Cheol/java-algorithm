package 일차원배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열초기화 {
    public static void main(String[] args) {
        // 1. Arrays.fill
        System.out.print("1. Arrays.fill - ");
        int fillArr[] = new int[5];
        Arrays.fill(fillArr, 10);
        for (int i : fillArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Arrays.setAll() - 분기 처리 가능
        System.out.print("2. Arrays.setAll() - ");
        int setAllArr[] = new int[5];
        Arrays.setAll(setAllArr, arr -> arr * 2); // 2의 배수
        for (int i : setAllArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3. Stream API (Java 1.8+) - 초기값 범위 설정도 가능
        System.out.print("3. Stream API (IntStream) - ");
        int streamArr[] = IntStream.range(0, 6).toArray();
        System.out.println(Arrays.toString(streamArr));
    }
}

// https://developer-talk.tistory.com/773


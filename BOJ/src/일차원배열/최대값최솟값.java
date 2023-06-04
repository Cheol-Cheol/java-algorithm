package 일차원배열;

import java.util.Arrays;

public class 최대값최솟값 {
    public static void main(String[] args) {
        int arr[] = {3, 1, 40, 2, 5, 237, 4};

        // 1. for문을 이용한 방법 (최소값의 경우에는 if 괄호 방향을 바꿔준다.)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("For문을 이용한 방법");
        System.out.println("최대값 : " + max);
        System.out.println("--------------------------");

        // 2. Arrays.sort를 이용한 방법
        System.out.println("Arrays.sort를 이용한 방법");
        Arrays.sort(arr);
        System.out.println("최대값 : " + arr[arr.length - 1]);
        System.out.println("최소값 : " + arr[0]);
        System.out.println("--------------------------");

        // 3. Stream을 이용한 방법
        System.out.println("Stream을 이용한 방법");
        // Arrays.stream(배열명)으로 배열 생성
        System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
        System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
    }
}

// https://wakestand.tistory.com/423
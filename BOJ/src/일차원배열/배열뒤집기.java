package 일차원배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열뒤집기 {
    public static void main(String[] args) {
        // 1. 라이브러리 사용x
        String arr[] = {"korea", "american", "japan", "china"};

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));

        // 1-2. 또 다른 예제 (새로운 배열을 만들어서 주입하기)
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 10, 12, 11, 14};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            b[i] = a[a.length - i - 1];
        }
        System.out.println(Arrays.toString(b));

        // 2. ArrayList를 사용한 배열 뒤집기
        String arr2[] = {"korea", "american", "japan", "china"};
        List<String> listItem = Arrays.asList(arr2);
        Collections.reverse(listItem);
        // System.out.println(Arrays.toString(listItem.toArray(arr2)));
        System.out.println(listItem);
    }
}

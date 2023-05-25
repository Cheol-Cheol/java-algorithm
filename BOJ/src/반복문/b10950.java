package 반복문;

import java.util.Scanner;

public class b10950 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            int A = kb.nextInt();
            int B = kb.nextInt();
            arr[i] = A + B;
        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}

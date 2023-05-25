package 반복문;

import java.util.Scanner;

public class b25304 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int totalPrice = kb.nextInt();
        int N = kb.nextInt();

        int sum = 0;
        String result = "Yes";

        for (int i = 0; i < N; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            sum += a * b;
        }

        if (totalPrice != sum) result = "No";
        System.out.println(result);
    }
}

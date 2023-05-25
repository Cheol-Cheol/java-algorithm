package 반복문;

import java.util.Scanner;

public class b2739 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        for (int i = 1; i < 10; i++) {
            String result = String.format("%d * %d = %d", N ,i, N*i);
            System.out.println(result);
        }
    }
}

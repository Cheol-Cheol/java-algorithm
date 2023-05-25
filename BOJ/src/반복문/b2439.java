package 반복문;

import java.util.Scanner;

public class b2439 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}

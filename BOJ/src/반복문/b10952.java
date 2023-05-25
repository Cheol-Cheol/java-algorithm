package 반복문;

import java.util.Scanner;

public class b10952 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            int A = kb.nextInt();
            int B = kb.nextInt();
            if (A == 0 && B == 0) break;
            System.out.println(A + B);
        }
    }
}

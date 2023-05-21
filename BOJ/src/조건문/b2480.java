package 조건문;

import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        // 셋 다 같을 경우
        if (A == B && B == C && A == C) {
            System.out.println(10000 + A * 1000);
        }
        // 두 개만 같을 경우
        else if (A == B || A == C){
            System.out.println(1000 + A * 100);
        }
        else if (B == C) {
            System.out.println(1000 + B * 100);
        }
        // 셋 다 다를 경우
        else {
            System.out.println(Math.max(Math.max(A, B), C) * 100);
        }
    }
}

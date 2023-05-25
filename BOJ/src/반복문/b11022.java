package 반복문;

import java.util.Scanner;

public class b11022 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = kb.nextInt();
            int B = kb.nextInt();

            String strFomat = String.format("Case #%d: %d + %d = %d", i, A, B, A + B);
            System.out.println(strFomat);
        }
    }
}

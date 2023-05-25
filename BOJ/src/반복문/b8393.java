package 반복문;

import java.util.Scanner;

public class b8393 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int result = 0;

        for (int i = n; i > 0; i--) {
            result += i;
        }

        System.out.println(result);
    }
}

package 조건문;

import java.util.Scanner;

public class b14681 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        int result = 1;

        if (x > 0) {
            if (y > 0) result = 1;
            else result = 4;
        } else {
            if (y > 0) result = 2;
            else result = 3;
        }

        System.out.println(result);
    }
}

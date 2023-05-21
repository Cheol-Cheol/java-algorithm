package 조건문;

import java.util.Scanner;

public class b2753 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year = kb.nextInt();
        int result = 0;

        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) result = 1;

        System.out.println(result);
    }
}

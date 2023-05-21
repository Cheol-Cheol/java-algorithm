package 조건문;

import java.util.Scanner;

public class b9498 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        char result;

        if (num >= 90) result = 'A';
        else if (num >= 80) result = 'B';
        else if (num >= 70) result = 'C';
        else if (num >= 60) result = 'D';
        else result = 'F';

        System.out.println(result);
    }
}

package 조건문;

import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        int B = kb.nextInt();

        if (A > B) System.out.println(">");
        else if (A < B) System.out.println("<");
        else System.out.println("==");
    }
}

package 입출력과사칙연산;

import java.util.Scanner;

public class b11382 {
    // 📍입력값 A, B, C (1 ≤ A, B, C ≤ 10^12)
    // -> int는 범위를 초과할 수 있으니 long으로 입력값을 받아야 한다.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long a = kb.nextLong();
        long b = kb.nextLong();
        long c = kb.nextLong();
        System.out.println(a+b+c);
    }
}

package 입출력과사칙연산;

import java.util.Scanner;

public class b2588 {
    public static void main(String[] args) {
        // 📍방법1) charAt() 활용
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        String B = kb.next();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));

        // 📍방법2) 나머지, 나눗셈 활용
        // Scanner kb = new Scanner(System.in);
        // int A = kb.nextInt();
        // int B = kb.nextInt();
        //
        // System.out.println(A * (B % 10));
        // System.out.println(A * (B % 100 / 10));
        // System.out.println(A * (B / 100));
        // System.out.println(A * B);

        // 📍방법3) 문자열 -> 문자 배열로 변환 활용
        // Scanner kb = new Scanner(System.in);
        // int A = kb.nextInt();
        // String B = kb.next();
        //
        // char [] arr = B.toCharArray();
        //
        // System.out.println(A * (arr[2] - '0'));
        // System.out.println(A * (arr[1] - '0'));
        // System.out.println(A * (arr[0] - '0'));
        // System.out.println(A * Integer.parseInt(B));
    }
}


package 조건문;

import java.util.Scanner;

public class b2525 {
    public static void main(String[] args) {
        // 📍 내 코드
        // Scanner kb = new Scanner(System.in);
        // int H = kb.nextInt();
        // int M = kb.nextInt();
        // int T = kb.nextInt();
        //
        // H = H + (M + T) / 60;
        // M = (M + T) % 60;
        // if (H >= 24) H -= 24;
        //
        // System.out.println(H + " " + M);

        // 📍 A(시)와 B(분)을 하나의 분으로 변환 뒤, C를 더하고 나온 결과 값을 다시 시와 분으로 변환하는 방법1
        Scanner kb = new Scanner(System.in);
        int H = kb.nextInt();
        int M = kb.nextInt();
        int T = kb.nextInt();

        int min = H * 60 + M; // 분으로 변환
        min = min + T;

        H = min / 60 % 24; // 나머지 연산으로 관리하는 법 맨날 까먹음
        M = min % 60;

        System.out.println(H + " " + M);

    }
}

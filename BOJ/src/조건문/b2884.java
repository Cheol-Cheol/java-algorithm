package 조건문;

import java.util.Scanner;

public class b2884 {
    public static void main(String[] args) {
        // 📍 코드1
        // Scanner kb = new Scanner(System.in);
        // int hour = kb.nextInt();
        // int minute = kb.nextInt();

        // if (minute < 45) {
        //     if (hour == 0) hour = 23;
        //     else hour -= 1;
        //     minute = 60 + (minute - 45);
        // } else minute -= 45;
        //
        // System.out.println(hour + " " + minute);

        // 📍 코드2
        Scanner kb = new Scanner(System.in);
        int H = kb.nextInt();
        int M = kb.nextInt();

        if (M < 45) {
            M = 60 - (45 - M);
            H--;
            if (H < 0) H = 23;
            System.out.println(H + " " + M);
        } else System.out.println(H + " " + (45 - M));
    }
}

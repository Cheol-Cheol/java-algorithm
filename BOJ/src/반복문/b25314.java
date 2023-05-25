package 반복문;

import java.util.Scanner;

public class b25314 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        String result = "";

        for (int i = 0; i < N/4; i++) {
            result += "long ";
        }
        result += "int";
        System.out.println(result);
    }
}

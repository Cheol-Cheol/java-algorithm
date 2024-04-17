package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[6];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        xx:
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (list[0] * x + list[1] * y == list[2]) {
                    if (list[3] * x + list[4] * y == list[5]) {
                        System.out.println(x + " " + y);
                        break xx;
                    }
                }
            }
        }
    }
}

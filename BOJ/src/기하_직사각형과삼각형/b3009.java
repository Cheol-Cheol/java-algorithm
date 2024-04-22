package 기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }
        int x = 0;
        int y = 0;

        if (xArr[0] == xArr[1]) {
            x = xArr[2];
        } else if (xArr[1] == xArr[2]) {
            x = xArr[0];
        } else {
            x = xArr[1];
        }

        if (yArr[0] == yArr[1]) {
            y = yArr[2];
        } else if (yArr[1] == yArr[2]) {
            y = yArr[0];
        } else {
            y = yArr[1];
        }

        System.out.print(x + " " + y);
    }
}

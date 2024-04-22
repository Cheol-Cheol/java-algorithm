package 기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] pipe = {a, b, c};
        Arrays.sort(pipe);

        if (pipe[0] + pipe[1] > pipe[2]) {
            System.out.println(pipe[0] + pipe[1] + pipe[2]);
        } else {
            System.out.println((pipe[0] + pipe[1]) * 2 - 1);
        }
        br.close();
    }
}

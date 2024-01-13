package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2차원 합 배열
        int[][] sBoard = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                sBoard[i][j] = sBoard[i - 1][j] + sBoard[i][j - 1] - sBoard[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        // 2차원 구간 합
        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sBoard[x2][y2] - sBoard[x1 - 1][y2] - sBoard[x2][y1 - 1] + sBoard[x1 - 1][y1 - 1]);
        }

    }
}

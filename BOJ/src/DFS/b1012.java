package DFS;

import java.io.*;
import java.util.StringTokenizer;

public class b1012 {
    final static int MAX = 50 + 10;
    static boolean[][] map;
    static int T, N, M, K;
    static int[] dirY = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dirX = {0, 0, -1, 1}; // 상 하 좌 우


    public static void dfs(int y, int x) {
        map[y][x] = false;

        for (int i = 0; i < 4; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if (map[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];

            // 1. Map 정보 초기화
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y + 1][x + 1] = true;
            }

            // 2. dfs 호출
            int answer = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (map[i][j]) {
                        answer++; // 최초 호출 시 +1
                        dfs(i, j);
                    }
                }
            }

            // 3. 출력
            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}

package DFS;

import java.io.*;
import java.util.StringTokenizer;

public class b13565 {
    final static int MAX = 1000 + 10;
    static boolean[][] map;
    static int[] dirY = {-1, 1, 0, 0};
    static int[] dirX = {0, 0, -1, 1};
    static int N, M;
    static boolean answer;

    public static void dfs(int y, int x) {
        // 안쪽에 접근했을 경우
        if (y == N) {
            answer = true;
            return;
        }

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
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[MAX][MAX];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = (str.charAt(j - 1) == '0') ? true : false;
            }
        }

        // dfs 수행
        for (int i = 1; i <= M; i++) {
            if (map[1][i]) {
                dfs(1, i);
            }
        }

        // 출력
        if (answer) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.close();
    }
}

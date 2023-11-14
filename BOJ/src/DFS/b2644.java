package DFS;

import java.io.*;
import java.util.StringTokenizer;

public class b2644 {
    final static int MAX = 100 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, start, end, answer;

    public static void dfs(int idx, int count) {
        visited[idx] = true;

        if (idx == end) {
            answer = count;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i, count + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = -1;

        // 1. 연결 정보 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // dfs
        dfs(start, 0);

        // 출력
        bw.write(String.valueOf(answer));

        bw.close();
        br.close();
    }
}

package DFS;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b1260 {

    final static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M, V;
    static ArrayList<Integer> queue; // bfs

    public static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");

        for (int i = 1; i <= N; i++) {
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX];

        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");

            for (int i = 1; i <= N; i++) {
                if (visited[i] == false && graph[idx][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        // 1. 연결 정보 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs 호출
        dfs(V);
        System.out.println();

        // 3. bfs 호출
        bfs();

        // // 4. dfs 출력

        br.close();
        bw.close();
    }
}

package doit.자료구조.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] tools = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 재료 초기화
        for (int i = 0; i < N; i++) {
            tools[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(tools);

        int lt = 0;
        int rt = N - 1;
        int cnt = 0;

        while (lt < rt) {
            int sum = tools[lt] + tools[rt];

            if (sum < M) {
                lt++;
            } else if (sum == M) {
                cnt++;
                rt--;
                lt++;
            } else {
                rt--;
            }
        }

        System.out.println(cnt);
    }
}

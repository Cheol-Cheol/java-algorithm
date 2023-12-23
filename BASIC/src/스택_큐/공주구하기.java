package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 공주구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0, answer = 0;

		// 큐 초기화
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		while (queue.size() != 1) {
			int tmp = queue.poll();
			cnt++;

			if (cnt != K) {
				queue.offer(tmp);
			} else {
				cnt = 0;
			}
		}

		answer = queue.poll();
		System.out.println(answer);
	}
}

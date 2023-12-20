package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 크레인인형뽑기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];

		// board 초기화
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int M = Integer.parseInt(br.readLine());
		int[] moves = new int[M];
		StringTokenizer st = new StringTokenizer(br.readLine());

		// moves 초기화
		for (int i = 0; i < moves.length; i++) {
			moves[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<>();
		int cnt = 0;

		for (int i = 0; i < moves.length; i++) {
			int pos = moves[i] - 1;

			for (int j = 0; j < board.length; j++) {

				if (board[j][pos] != 0) {

					if (!stack.isEmpty() && (stack.peek() == board[j][pos])) {
						board[j][pos] = 0;
						stack.pop();
						cnt += 2;
					} else {
						stack.push(board[j][pos]);
						board[j][pos] = 0;
					}

					break;
				}
			}
		}

		System.out.println(cnt);
	}
}

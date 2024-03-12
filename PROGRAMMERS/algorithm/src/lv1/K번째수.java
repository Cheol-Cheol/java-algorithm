package lv1;

import java.util.Arrays;

public class K번째수 {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int target = commands[i][2];
			int[] tmp = Arrays.copyOfRange(array, start - 1, end);

			Arrays.sort(tmp);
			answer[i] = tmp[target - 1];
		}

		return answer;
	}

	public static void main(String[] args) {
		K번째수 T = new K번째수();
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] cmds = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(T.solution(arr, cmds)));
	}
}

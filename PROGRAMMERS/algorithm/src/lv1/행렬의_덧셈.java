package lv1;

import java.util.Arrays;

public class 행렬의_덧셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr1[i][j] += arr2[i][j];
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		행렬의_덧셈 T = new 행렬의_덧셈();
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		int[][] solution = T.solution(arr1, arr2);

		System.out.print("[");
		for (int i = 0; i < solution.length; i++) {
			System.out.print(Arrays.toString(solution[i]));

			if (i < solution.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print("]");
			}
		}
	}
}

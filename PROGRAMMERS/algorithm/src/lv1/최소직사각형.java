package lv1;

/**
 * 회전이 가능
 */
public class 최소직사각형 {

	public int solution(int[][] sizes) {
		int length = Integer.MIN_VALUE;
		int height = Integer.MIN_VALUE;

		for (int i = 0; i < sizes.length; i++) {
			length = Math.max(length, Math.max(sizes[i][0], sizes[i][1]));
			height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
		}

		return length * height;
	}

	public static void main(String[] args) {
		최소직사각형 T = new 최소직사각형();
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(T.solution(sizes));
	}
}

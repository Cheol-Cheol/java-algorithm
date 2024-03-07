package lv1;

public class 삼총사 {
	public int solution(int[] number) {
		int answer = 0;

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				for (int k = j + 1; k < number.length; k++) {
					if (number[i] + number[j]  + number[k]== 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		삼총사 T = new 삼총사();
		System.out.println(T.solution(new int[] {-2, 3, 0, 2, -5}));
	}
}

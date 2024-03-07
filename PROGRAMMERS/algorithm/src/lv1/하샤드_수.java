package lv1;

/**
 * 하샤드 수: x % x의 자릿수의 합 == 0
 */
public class 하샤드_수 {
	public boolean solution(int x) {
		int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
		return x % sum == 0;
	}

	public static void main(String[] args) {
		하샤드_수 T = new 하샤드_수();
		System.out.println(T.solution(10));
	}
}

// public boolean solution(int x) {
// 	int sum = 0;
// 	int origin = x;
//
// 	while (true) {
// 		sum += (x % 10);
//
// 		if (x < 10) {
// 			break;
// 		}
//
// 		x = x / 10;
// 	}
//
// 	return origin % sum == 0;
// }
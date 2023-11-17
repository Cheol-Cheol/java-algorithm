package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 뒤집은소수 {

	public static boolean isPrime(int num) {

		if (num == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		for (int num : nums) {
			// swap
			String numToStr = String.valueOf(num);
			String reversedStr = new StringBuilder(numToStr).reverse().toString();
			int reversedNum = Integer.parseInt(reversedStr);

			if (isPrime(reversedNum)) {
				System.out.print(reversedNum + " ");
			}
		}
	}
}

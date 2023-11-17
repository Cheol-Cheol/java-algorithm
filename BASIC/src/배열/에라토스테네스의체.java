package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 에라토스테네스의체 {

	public static boolean isPrime(int num) {

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ipt = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 2; i <= ipt; i++) {
			if (isPrime(i))
				cnt++;
		}

		System.out.println(cnt);
	}
}

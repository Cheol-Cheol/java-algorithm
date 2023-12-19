package 해시_정렬지원Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class K번째큰수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int answer = -1;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					Tset.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}

		int cnt = 0;
		for (int x : Tset) {
			cnt++;
			if (cnt == K) {
				answer = x;
				break;
			}
		}

		System.out.println(answer);
	}
}

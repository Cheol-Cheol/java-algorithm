package 해시_정렬지원Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 학급회장 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split("");
		int max = Integer.MIN_VALUE;
		String answer = "";
		HashMap<String, Integer> h = new HashMap<>(T);

		for (String s : arr) {
			// if (h.containsKey(s)) {
			// 	h.replace(s, h.get(s) + 1);
			// } else {
			// 	h.put(s, 1);
			// }

			h.put(s, h.getOrDefault(s, 0) + 1);
		}

		for (String s : h.keySet()) {
			if (max < h.get(s)) {
				max = h.get(s);
				answer = s;
			}
		}

		System.out.println(answer);
	}
}

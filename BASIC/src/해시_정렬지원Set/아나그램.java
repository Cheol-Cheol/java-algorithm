package 해시_정렬지원Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split("");
		String[] arr2 = br.readLine().split("");
		HashMap<String, Integer> map1 = new HashMap<>(arr1.length);
		HashMap<String, Integer> map2 = new HashMap<>(arr2.length);
		String answer = "YES";

		for (String s : arr1) {
			map1.put(s, map1.getOrDefault(s, 0) + 1);
		}

		for (String s : arr2) {
			map2.put(s, map2.getOrDefault(s, 0) + 1);
		}

		for (String s : map1.keySet()) {
			if (map2.containsKey(s)) {
				if (!(map1.get(s).equals(map2.get(s)))){
					answer = "NO";
				}
			} else {
				answer = "NO";
			}
		}

		System.out.println(answer);
	}
}

package lv1;

import java.util.HashSet;

// 1. 선택 가능한 종류의 개수의 최댓값을 구하라
// 2. 종류를 구하기 위한 중복 제거 (set)
// 3. 중복 없는 set 개수와 가져갈 수 있는 개수 비교
//      1. size가 크면 mid 반환
//      2. mid가 크면 size 반환
public class 폰켓몬 {
	public int solution(int[] nums) {
		int answer = 0;
		int mid = nums.length / 2;

		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		if(mid <= set.size()) {
			answer = mid;
		} else {
			answer = set.size();
		}

		return answer;
	}

	public static void main(String[] args) {
		폰켓몬 T = new 폰켓몬();
		System.out.println(T.solution(new int[] {3, 1, 2, 3}));
	}
}

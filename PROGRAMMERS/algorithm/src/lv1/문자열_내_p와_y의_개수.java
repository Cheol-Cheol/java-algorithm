package lv1;

public class 문자열_내_p와_y의_개수 {
	boolean solution(String s) {
        int cnt = 0;

        for (char c : s.toUpperCase().toCharArray()) {
            if(c == 'P') {
                cnt++;
            } else if (c == 'Y') {
                cnt--;
            }
        }

        return cnt == 0;
	}

	public static void main(String[] args) {
		문자열_내_p와_y의_개수 T = new 문자열_내_p와_y의_개수();
		System.out.println(T.solution("pPoooyY"));
	}
}


// boolean solution(String s) {
//     int pCnt = 0;
//     int yCnt = 0;
//
//     for (char c : s.toUpperCase().toCharArray()) {
//         if(c == 'P') {
//             pCnt++;
//         } else if (c == 'Y') {
//             yCnt++;
//         }
//     }
//
//     return pCnt == yCnt ? true : false;
// }
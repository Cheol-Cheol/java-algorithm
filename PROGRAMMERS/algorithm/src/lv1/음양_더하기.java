package lv1;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }

    public static void main(String[] args) {
        음양_더하기 T = new 음양_더하기();
        System.out.println(T.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }
}

// public int solution(int[] absolutes, boolean[] signs) {
//     int answer = 0;
//
//     for (int i = 0; i < absolutes.length; i++) {
//         if(signs[i]){
//             answer += absolutes[i];
//         } else {
//             answer -= absolutes[i];
//         }
//     }
//
//     return answer;
// }
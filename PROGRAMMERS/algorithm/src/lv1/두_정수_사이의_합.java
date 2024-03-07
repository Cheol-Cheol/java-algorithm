package lv1;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
    public static void main(String[] args) {
        두_정수_사이의_합 T = new 두_정수_사이의_합();
        System.out.println(T.solution(5, 3));
    }
}

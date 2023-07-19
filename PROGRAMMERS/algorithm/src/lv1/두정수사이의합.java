package lv1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i = min; i <= max; i++){
            answer += i;
        }

        return answer;
    }
    public static void main(String[] args) {
        두정수사이의합 T = new 두정수사이의합();
        System.out.println(T.solution(5, 3));
    }
}

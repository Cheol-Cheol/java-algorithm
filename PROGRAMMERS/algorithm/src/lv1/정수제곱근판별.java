package lv1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;

        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        정수제곱근판별 T = new 정수제곱근판별();
        System.out.println(T.solution(3));
    }
}

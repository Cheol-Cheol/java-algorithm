package lv1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;

            if (n < 10) break;

            n /= 10;
        }


        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 T = new 자릿수더하기();
        System.out.println(T.solution(987));
    }
}

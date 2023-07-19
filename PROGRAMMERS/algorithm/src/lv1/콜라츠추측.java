package lv1;

public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;

        while (true) {
            if (answer == 500) return -1;

            if (num % 2 == 0) num /= 2;
            else num = num * 3 + 1;

            answer += 1;

            if(num == 1) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 T = new 콜라츠추측();
        System.out.println(T.solution(626331));
    }
}

package lv1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += (price * i);
        }

        return answer - money > 0 ? answer - money : 0;
    }

    public static void main(String[] args) {
        부족한_금액_계산하기 T = new 부족한_금액_계산하기();
        System.out.println(T.solution(3,20,4));
    }
}

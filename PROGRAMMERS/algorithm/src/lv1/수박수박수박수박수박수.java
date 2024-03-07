package lv1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i % 2 == 0 ? "수" : "박";
        }

        return answer;
    }

    public static void main(String[] args) {
        수박수박수박수박수박수 T = new 수박수박수박수박수박수();
        System.out.println(T.solution(4));
    }
}

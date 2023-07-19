package lv1;


public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String[] answer = phone_number.split("");

        for (int i = 0; i < answer.length - 4; i++) {
            answer[i] = "*";
        }

        return String.join("", answer);
    }

    public static void main(String[] args) {
        핸드폰번호가리기 T = new 핸드폰번호가리기();
        System.out.println(T.solution("027778888"));
    }
}

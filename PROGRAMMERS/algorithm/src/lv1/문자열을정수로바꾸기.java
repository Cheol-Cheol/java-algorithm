package lv1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        문자열을정수로바꾸기 T = new 문자열을정수로바꾸기();
        System.out.println(T.solution("-1234"));
    }
}

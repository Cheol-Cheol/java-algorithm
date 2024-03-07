package lv1;

public class 문자열을_정수로_바꾸기 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        문자열을_정수로_바꾸기 T = new 문자열을_정수로_바꾸기();
        System.out.println(T.solution("-1234"));
    }
}

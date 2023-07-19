package lv1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        가운데글자가져오기 T = new 가운데글자가져오기();
        System.out.println(T.solution("qwer"));
    }
}

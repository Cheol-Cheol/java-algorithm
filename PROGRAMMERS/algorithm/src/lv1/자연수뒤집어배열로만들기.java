package lv1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String strNum = String.valueOf(n);
        int[] answer = new int[strNum.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[strNum.length() - i - 1] = strNum.charAt(i) - 48;
        }

        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 T = new 자연수뒤집어배열로만들기();
        System.out.println(T.solution(12345));
    }
}

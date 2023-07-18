package lv1;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;

        char[] chars = ("" + x).toCharArray();
        int sum = 0;

        for (char c : chars) {
            sum += (c - 48);
        }

        if (x % sum != 0) return false;

        return answer;
    }

    public static void main(String[] args) {
        하샤드수 T = new 하샤드수();
        System.out.println(T.solution(13));
    }
}

// 10 - true 12 - true 11 - false 13 - false
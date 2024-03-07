package lv1;

/**
 * num % 2 == 0 -> Even
 * num % 2 != 0 -> Odd
 */
public class 짝수와_홀수 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        짝수와_홀수 T = new 짝수와_홀수();
        System.out.println(T.solution(3));
    }
}

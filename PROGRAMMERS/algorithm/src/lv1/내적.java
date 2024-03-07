package lv1;

public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        내적 T = new 내적();
        System.out.println(T.solution(new int[]{-1,0,1}, new int[]{1,0,-1}));
    }
}

package lv1;

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;

        for (int num : arr) {
            answer += num;
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        평균구하기 T = new 평균구하기();
        int[] arr = {1, 2, 3, 4};
        System.out.println(T.solution(arr));
    }
}

package doit.자료구조.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] S = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬
        for (int i = 1; i < N; i++) {
            int insert_point = 0;
            int insert_value = A[i]; // 데이터를 옮긴 후, 최종적으로 삽입할 데이터를 저장해둘 임시 변수

            // 삽입 위치 찾기(특정 값보다 작은 데이터 찾기)
            for (int j = i - 1; j >= 0; j--) {
                if (A[i] > A[j]) {
                    insert_point = j + 1;
                    break;
                }
            }

            // 삽입 위치 이후 데이터들 옮기기
            for (int j = i; j > insert_point; j--) {
                A[j] = A[j - 1];
            }

            A[insert_point] = insert_value;
        }

        // 합 배열
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        int sum = 0;
        for (int i : S) {
            sum += i;
        }
        System.out.println(sum);
    }
}

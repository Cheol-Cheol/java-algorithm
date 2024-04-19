package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());

        int cnt = 0;
        int lt = 0;
        int rt = numbers.length - 1;
        Arrays.sort(numbers);

        while (lt < rt) {
            if (numbers[lt] + numbers[rt] == X) {
                cnt++;
            }

            if (numbers[lt] + numbers[rt] >= X) {
                rt--;
            } else {
                lt++;
            }
        }

        System.out.println(cnt);
    }
}

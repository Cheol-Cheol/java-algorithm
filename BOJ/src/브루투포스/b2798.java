package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for (int one : cards) {
            for (int two : cards) {
                for (int three : cards) {
                    if (one == two || two == three || one == three){
                        continue;
                    }

                    int sum = one + two + three;
                    if (sum <= M && max < sum) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}

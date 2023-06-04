package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        double[] scores = new double[Integer.parseInt(br.readLine())];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(scores);

        double sum = 0;
        double max = scores[scores.length - 1];
        // 40 60 80

        for (int j = 0; j < scores.length; j++) {
            sum += ((scores[j] / max) * 100);
        }

        System.out.println(sum / scores.length);
    }
}

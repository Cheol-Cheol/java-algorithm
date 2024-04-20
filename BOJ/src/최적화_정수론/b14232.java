package 최적화_정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b14232 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        List<Integer> answer = new ArrayList<>();
        for (int i = 2; i <= (int) Math.sqrt(K); i++) {
            if (K % i == 0) {
                answer.add(i);
                answer.add(K / i);
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        answer.stream().forEach(e -> System.out.print(e + " "));
    }
}

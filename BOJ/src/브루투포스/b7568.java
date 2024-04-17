package 브루투포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] humans = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            humans[i][0] = Integer.parseInt(st.nextToken());
            humans[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int target = 0; target < N; target++) {
            int rank = 1;

            for (int other = 0; other < N; other++) {
                // 서로 다른 사람 비교
                if (target == other) {
                    continue;
                }

                // 키, 몸무게 둘 다 작으면 rank를 +1 해주기
                if (humans[target][0] < humans[other][0] && humans[target][1] < humans[other][1]) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }

        br.close();
    }
}

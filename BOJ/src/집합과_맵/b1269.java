package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class b1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aLen = Integer.parseInt(st.nextToken());
        int bLen = Integer.parseInt(st.nextToken());
        Set<Integer> A = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aLen; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < bLen; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (A.contains(target)) {
                cnt++;
            }
        }
        System.out.println(aLen + bLen - cnt * 2);
        br.close();
    }
}
